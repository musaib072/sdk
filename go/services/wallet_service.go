package services

import (
	"context"
	"encoding/json"
	sdk "github.com/trinsic-id/sdk/go/proto"
	"google.golang.org/grpc"
)

func CreateWalletService(profile *sdk.AccountProfile, serverConfig *sdk.ServerConfig, channel *grpc.ClientConn) (WalletService, error) {
	base, err := NewServiceBase(profile, serverConfig, channel)
	if err != nil {
		return nil, err
	}
	service := &WalletBase{
		ServiceBase: base,
		client:      sdk.NewUniversalWalletClient(base.channel),
	}

	return service, nil
}

type WalletService interface {
	Service

	Search(userContext context.Context, query string) (*sdk.SearchResponse, error)
	InsertItem(userContext context.Context, item Document) (string, error)
	DeleteItem(userContext context.Context, request *sdk.DeleteItemRequest) (*sdk.DeleteItemResponse, error)
}

type WalletBase struct {
	*ServiceBase
	channel *grpc.ClientConn
	client  sdk.UniversalWalletClient
}

func (w *WalletBase) Search(userContext context.Context, query string) (*sdk.SearchResponse, error) {
	request := &sdk.SearchRequest{
		Query: query,
	}
	md, err := w.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := w.client.Search(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

func (w *WalletBase) InsertItem(userContext context.Context, item Document) (string, error) {
	jsonString, err := json.Marshal(item)
	if err != nil {
		return "", err
	}
	request := &sdk.InsertItemRequest{
		Item: &sdk.JsonPayload{
			Json: &sdk.JsonPayload_JsonString{
				JsonString: string(jsonString),
			},
		},
	}
	md, err := w.GetMetadataContext(userContext, request)
	if err != nil {
		return "", err
	}
	response, err := w.client.InsertItem(md, request)
	if err != nil {
		return "", err
	}
	return response.ItemId, nil
}

func (w *WalletBase) DeleteItem(userContext context.Context, request *sdk.DeleteItemRequest) (*sdk.DeleteItemResponse, error) {
	md, err := w.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := w.client.Deleteitem(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}
