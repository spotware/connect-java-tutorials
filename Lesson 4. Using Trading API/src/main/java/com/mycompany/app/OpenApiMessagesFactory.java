package com.mycompany.app;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xtrader.protocol.proto.commons.*;
import com.xtrader.protocol.proto.commons.model.*;
import com.xtrader.protocol.proto.openapi.*;
import com.xtrader.protocol.proto.openapi.model.*;

public class OpenApiMessagesFactory {
    private int lastMessagePayloadType = 0;
    private ByteString lastMessagePayload = null;

    public final ProtoMessage getMessage(byte[] msg) throws InvalidProtocolBufferException {
        ProtoMessage _msg = ProtoMessage.newBuilder().mergeFrom(msg).build();
        lastMessagePayloadType = _msg.getPayloadType();
        lastMessagePayload = _msg.getPayload();
        return _msg;
    }

    public final int getPayloadType() throws InvalidProtocolBufferException {
        return getPayloadType(null);
    }

    public final int getPayloadType(byte[] msg) throws InvalidProtocolBufferException {
        if (msg != null) {
            getMessage(msg);
        }
        return lastMessagePayloadType;
    }

    public final ByteString getPayload() throws InvalidProtocolBufferException {
        return getPayload(null);
    }

    public final ByteString getPayload(byte[] msg) throws InvalidProtocolBufferException {
        if (msg != null) {
            getMessage(msg);
        }
        return lastMessagePayload;
    }

    public final ProtoPingReq GetPingRequest() throws InvalidProtocolBufferException {
        return GetPingRequest(null);
    }

    public final ProtoPingReq GetPingRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoPingReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoPingRes GetPingResponse() throws InvalidProtocolBufferException {
        return GetPingResponse(null);
    }

    public final ProtoPingRes GetPingResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoPingRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoHeartbeatEvent GetHeartbeatEvent() throws InvalidProtocolBufferException {
        return GetHeartbeatEvent(null);
    }

    public final ProtoHeartbeatEvent GetHeartbeatEvent(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoHeartbeatEvent.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoErrorRes GetErrorResponse() throws InvalidProtocolBufferException {
        return GetErrorResponse(null);
    }

    public final ProtoErrorRes GetErrorResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoErrorRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAAuthReq GetAuthorizationRequest() throws InvalidProtocolBufferException {
        return GetAuthorizationRequest(null);
    }

    public final ProtoOAAuthReq GetAuthorizationRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAAuthReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAAuthRes GetAuthorizationResponse() throws InvalidProtocolBufferException {
        return GetAuthorizationResponse(null);
    }

    public final ProtoOAAuthRes GetAuthorizationResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAAuthRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOASubscribeForTradingEventsReq GetSubscribeForTradingEventsRequest() throws InvalidProtocolBufferException {
        return GetSubscribeForTradingEventsRequest(null);
    }

    public final ProtoOASubscribeForTradingEventsReq GetSubscribeForTradingEventsRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOASubscribeForTradingEventsReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOASubscribeForTradingEventsRes GetSubscribeForTradingEventsResponse() throws InvalidProtocolBufferException {
        return GetSubscribeForTradingEventsResponse(null);
    }

    public final ProtoOASubscribeForTradingEventsRes GetSubscribeForTradingEventsResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOASubscribeForTradingEventsRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAUnsubscribeFromTradingEventsReq GetUnsubscribeForTradingEventsRequest() throws InvalidProtocolBufferException {
        return GetUnsubscribeForTradingEventsRequest(null);
    }

    public final ProtoOAUnsubscribeFromTradingEventsReq GetUnsubscribeForTradingEventsRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAUnsubscribeFromTradingEventsReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAUnsubscribeFromTradingEventsRes GetUnsubscribeForTradingEventsResponse() throws InvalidProtocolBufferException {
        return GetUnsubscribeForTradingEventsResponse(null);
    }

    public final ProtoOAUnsubscribeFromTradingEventsRes GetUnsubscribeForTradingEventsResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAUnsubscribeFromTradingEventsRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAGetSubscribedAccountsReq GetAllSubscriptionsForTradingEventsRequest() throws InvalidProtocolBufferException {
        return GetAllSubscriptionsForTradingEventsRequest(null);
    }

    public final ProtoOAGetSubscribedAccountsReq GetAllSubscriptionsForTradingEventsRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAGetSubscribedAccountsReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAGetSubscribedAccountsRes GetAllSubscriptionsForTradingEventsResponse() throws InvalidProtocolBufferException {
        return GetAllSubscriptionsForTradingEventsResponse(null);
    }

    public final ProtoOAGetSubscribedAccountsRes GetAllSubscriptionsForTradingEventsResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAGetSubscribedAccountsRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAExecutionEvent GetExecutionEvent() throws InvalidProtocolBufferException {
        return GetExecutionEvent(null);
    }

    public final ProtoOAExecutionEvent GetExecutionEvent(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAExecutionEvent.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOACreateOrderReq GetCreateOrderRequest() throws InvalidProtocolBufferException {
        return GetCreateOrderRequest(null);
    }

    public final ProtoOACreateOrderReq GetCreateOrderRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOACreateOrderReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOACancelOrderReq GetCancelOrderRequest() throws InvalidProtocolBufferException {
        return GetCancelOrderRequest(null);
    }

    public final ProtoOACancelOrderReq GetCancelOrderRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOACancelOrderReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAClosePositionReq GetClosePositionRequest() throws InvalidProtocolBufferException {
        return GetClosePositionRequest(null);
    }

    public final ProtoOAClosePositionReq GetClosePositionRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAClosePositionReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAAmendPositionStopLossTakeProfitReq GetAmendPositionStopLossTakeProfitRequest() throws InvalidProtocolBufferException {
        return GetAmendPositionStopLossTakeProfitRequest(null);
    }

    public final ProtoOAAmendPositionStopLossTakeProfitReq GetAmendPositionStopLossTakeProfitRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAAmendPositionStopLossTakeProfitReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAAmendOrderReq GetAmendOrderRequest() throws InvalidProtocolBufferException {
        return GetAmendOrderRequest(null);
    }

    public final ProtoOAAmendOrderReq GetAmendOrderRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAAmendOrderReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOASubscribeForSpotsReq GetSubscribeForSpotsRequest() throws InvalidProtocolBufferException {
        return GetSubscribeForSpotsRequest(null);
    }

    public final ProtoOASubscribeForSpotsReq GetSubscribeForSpotsRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOASubscribeForSpotsReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOASubscribeForSpotsRes GetSubscribeForSpotsResponse() throws InvalidProtocolBufferException {
        return GetSubscribeForSpotsResponse(null);
    }

    public final ProtoOASubscribeForSpotsRes GetSubscribeForSpotsResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOASubscribeForSpotsRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAUnsubscribeFromSpotsReq GetUnsubscribeFromSpotsRequest() throws InvalidProtocolBufferException {
        return GetUnsubscribeFromSpotsRequest(null);
    }

    public final ProtoOAUnsubscribeFromSpotsReq GetUnsubscribeFromSpotsRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAUnsubscribeFromSpotsReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAUnsubscribeFromSpotsRes GetUnsubscribeFromSpotsResponse() throws InvalidProtocolBufferException {
        return GetUnsubscribeFromSpotsResponse(null);
    }

    public final ProtoOAUnsubscribeFromSpotsRes GetUnsubscribeFromSpotsResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAUnsubscribeFromSpotsRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAGetSpotSubscriptionReq GetGetSpotSubscriptionRequest() throws InvalidProtocolBufferException {
        return GetGetSpotSubscriptionRequest(null);
    }

    public final ProtoOAGetSpotSubscriptionReq GetGetSpotSubscriptionRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAGetSpotSubscriptionReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAGetSpotSubscriptionRes GetGetSpotSubscriptionResponse() throws InvalidProtocolBufferException {
        return GetGetSpotSubscriptionResponse(null);
    }

    public final ProtoOAGetSpotSubscriptionRes GetGetSpotSubscriptionResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAGetSpotSubscriptionRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAGetAllSpotSubscriptionsReq GetGetAllSpotSubscriptionsRequest() throws InvalidProtocolBufferException {
        return GetGetAllSpotSubscriptionsRequest(null);
    }

    public final ProtoOAGetAllSpotSubscriptionsReq GetGetAllSpotSubscriptionsRequest(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAGetAllSpotSubscriptionsReq.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOAGetAllSpotSubscriptionsRes GetGetAllSpotSubscriptionsResponse() throws InvalidProtocolBufferException {
        return GetGetAllSpotSubscriptionsResponse(null);
    }

    public final ProtoOAGetAllSpotSubscriptionsRes GetGetAllSpotSubscriptionsResponse(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOAGetAllSpotSubscriptionsRes.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    public final ProtoOASpotEvent GetSpotEvent() throws InvalidProtocolBufferException {
        return GetSpotEvent(null);
    }

    public final ProtoOASpotEvent GetSpotEvent(byte[] msg) throws InvalidProtocolBufferException {
        return ProtoOASpotEvent.newBuilder().mergeFrom(getPayload(msg)).build();
    }

    ///#endregion


    ///#region Creating new Proto messages with parameters specified

    public final ProtoMessage createMessage(int payloadType, ByteString payload) {
        return createMessage(payloadType, payload, null);
    }

    public final ProtoMessage createMessage(int payloadType) {
        return createMessage(payloadType, null, null);
    }

    public final ProtoMessage createMessage(int payloadType, ByteString payload, String clientMsgId) {
        ProtoMessage.Builder protoMsg = ProtoMessage.newBuilder();
        protoMsg.setPayloadType(payloadType);
        if (payload != null) {
            protoMsg.setPayload(payload);
        }
        if (clientMsgId != null) {
            protoMsg.setClientMsgId(clientMsgId);
        }

        return protoMsg.build();
    }

    public final ProtoMessage createMessage(ProtoMessage.Builder messageBuilder) {
        return createMessage(messageBuilder, null);
    }


    public final ProtoMessage createMessage(ProtoMessage.Builder messageBuilder, String clientMsgId) {
        return createMessage(messageBuilder.getPayloadType(), messageBuilder.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createPingRequest(long timestamp) {
        return createPingRequest(timestamp, null);
    }

    public final ProtoMessage createPingRequest(long timestamp, String clientMsgId) {
        return createMessage(ProtoPayloadType.PING_REQ.getNumber(), ProtoPingReq.newBuilder().setTimestamp(timestamp).build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createPingResponse(long timestamp) {
        return createPingResponse(timestamp, null);
    }

    public final ProtoMessage createPingResponse(long timestamp, String clientMsgId) {
        return createMessage(ProtoPayloadType.PING_REQ.getNumber(), ProtoPingRes.newBuilder().setTimestamp(timestamp).build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createHeartbeatEvent() {
        return createHeartbeatEvent(null);
    }

    public final ProtoMessage createHeartbeatEvent(String clientMsgId) {


        return createMessage(ProtoPayloadType.HEARTBEAT_EVENT.getNumber(), ProtoHeartbeatEvent.newBuilder().build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAuthorizationRequest(String clientId, String clientSecret) {
        return createAuthorizationRequest(clientId, clientSecret, null);
    }


    public final ProtoMessage createAuthorizationRequest(String clientId, String clientSecret, String clientMsgId) {
        ProtoOAAuthReq.Builder _msg = ProtoOAAuthReq.newBuilder();
        _msg.setClientId(clientId);
        _msg.setClientSecret(clientSecret);
        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAuthorizationResponse() {
        return createAuthorizationResponse(null);
    }


    public final ProtoMessage createAuthorizationResponse(String clientMsgId) {


        return createMessage(ProtoOAPayloadType.OA_AUTH_RES.getNumber(), ProtoOAAuthRes.newBuilder().build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createSubscribeForTradingEventsRequest(long accountId, String accessToken) {
        return createSubscribeForTradingEventsRequest(accountId, accessToken, null);
    }


    public final ProtoMessage createSubscribeForTradingEventsRequest(long accountId, String accessToken, String clientMsgId) {
        ProtoOASubscribeForTradingEventsReq.Builder _msg = ProtoOASubscribeForTradingEventsReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createSubscribeForTradingEventsResponse() {
        return createSubscribeForTradingEventsResponse(null);
    }


    public final ProtoMessage createSubscribeForTradingEventsResponse(String clientMsgId) {


        return createMessage(ProtoOAPayloadType.OA_SUBSCRIBE_FOR_TRADING_EVENTS_RES.getNumber(), ProtoOASubscribeForTradingEventsRes.newBuilder().build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createUnsubscribeForTradingEventsRequest(long accountId) {
        return createUnsubscribeForTradingEventsRequest(accountId, null);
    }


    public final ProtoMessage createUnsubscribeForTradingEventsRequest(long accountId, String clientMsgId) {
        ProtoOAUnsubscribeFromTradingEventsReq.Builder _msg = ProtoOAUnsubscribeFromTradingEventsReq.newBuilder();
        _msg.setAccountId(accountId);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createUnsubscribeForTradingEventsResponse() {
        return createUnsubscribeForTradingEventsResponse(null);
    }


    public final ProtoMessage createUnsubscribeForTradingEventsResponse(String clientMsgId) {


        return createMessage(ProtoOAPayloadType.OA_UNSUBSCRIBE_FROM_TRADING_EVENTS_RES.getNumber(), ProtoOAUnsubscribeFromTradingEventsRes.newBuilder().build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAllSubscriptionsForTradingEventsRequest() {
        return createAllSubscriptionsForTradingEventsRequest(null);
    }


    public final ProtoMessage createAllSubscriptionsForTradingEventsRequest(String clientMsgId) {


        return createMessage(ProtoOAPayloadType.OA_GET_SUBSCRIBED_ACCOUNTS_REQ.getNumber(), ProtoOAGetSubscribedAccountsReq.newBuilder().build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAllSubscriptionsForTradingEventsResponse(java.util.ArrayList<Long> accountIdsList) {
        return createAllSubscriptionsForTradingEventsResponse(accountIdsList, null);
    }


    public final ProtoMessage createAllSubscriptionsForTradingEventsResponse(java.util.ArrayList<Long> accountIdsList, String clientMsgId) {
        ProtoOAGetSubscribedAccountsRes.Builder _msg = ProtoOAGetSubscribedAccountsRes.newBuilder();
        for (long accountId : accountIdsList) {
            _msg.addAccountId(accountId);
        }


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createExecutionEvent(ProtoOAExecutionType executionType, ProtoOAOrder order, ProtoOAPosition position, String reasonCode) {
        return createExecutionEvent(executionType, order, position, reasonCode, null);
    }

    public final ProtoMessage createExecutionEvent(ProtoOAExecutionType executionType, ProtoOAOrder order, ProtoOAPosition position) {
        return createExecutionEvent(executionType, order, position, null, null);
    }

    public final ProtoMessage createExecutionEvent(ProtoOAExecutionType executionType, ProtoOAOrder order) {
        return createExecutionEvent(executionType, order, null, null, null);
    }


    public final ProtoMessage createExecutionEvent(ProtoOAExecutionType executionType, ProtoOAOrder order, ProtoOAPosition position, String reasonCode, String clientMsgId) {
        ProtoOAExecutionEvent.Builder _msg = ProtoOAExecutionEvent.newBuilder();
        _msg.setExecutionType(executionType);
        _msg.setOrder(order);
        if (position != null) {
            _msg.setPosition(position);
        }
        if (reasonCode != null) {
            _msg.setReasonCode(reasonCode);
        }


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createExecutionEvent(ProtoOAExecutionType executionType, ProtoOAOrder.Builder order, ProtoOAPosition.Builder position, String reasonCode) {
        return createExecutionEvent(executionType, order, position, reasonCode, null);
    }

    public final ProtoMessage createExecutionEvent(ProtoOAExecutionType executionType, ProtoOAOrder.Builder order, ProtoOAPosition.Builder position) {
        return createExecutionEvent(executionType, order, position, null, null);
    }

    public final ProtoMessage createExecutionEvent(ProtoOAExecutionType executionType, ProtoOAOrder.Builder order) {
        return createExecutionEvent(executionType, order, null, null, null);
    }


    public final ProtoMessage createExecutionEvent(ProtoOAExecutionType executionType, ProtoOAOrder.Builder order, ProtoOAPosition.Builder position, String reasonCode, String clientMsgId) {
        return createExecutionEvent(executionType, order.build(), position == null ? null : position.build(), reasonCode, clientMsgId);
    }

    public final ProtoMessage createMarketOrderRequest(long accountId, String accessToken, String symbolName, ProtoTradeSide tradeSide, long volume) {
        return createMarketOrderRequest(accountId, accessToken, symbolName, tradeSide, volume, null);
    }


    public final ProtoMessage createMarketOrderRequest(long accountId, String accessToken, String symbolName, ProtoTradeSide tradeSide, long volume, String clientMsgId) {
        ProtoOACreateOrderReq.Builder _msg = ProtoOACreateOrderReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setSymbolName(symbolName);
        _msg.setOrderType(ProtoOAOrderType.OA_MARKET);
        _msg.setTradeSide(tradeSide);
        _msg.setVolume(volume);

        //_msg.setRelativeStopLossInPips(27);
        //_msg.setRelativeTakeProfitInPips(1);

        _msg.setComment("TradingApiTest.CreateMarketOrderRequest");


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createMarketRangeOrderRequest(long accountId, String accessToken, String symbolName, ProtoTradeSide tradeSide, long volume, double baseSlippagePrice, long slippageInPips) {
        return createMarketRangeOrderRequest(accountId, accessToken, symbolName, tradeSide, volume, baseSlippagePrice, slippageInPips, null);
    }


    public final ProtoMessage createMarketRangeOrderRequest(long accountId, String accessToken, String symbolName, ProtoTradeSide tradeSide, long volume, double baseSlippagePrice, long slippageInPips, String clientMsgId) {
        ProtoOACreateOrderReq.Builder _msg = ProtoOACreateOrderReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setSymbolName(symbolName);
        _msg.setOrderType(ProtoOAOrderType.OA_MARKET_RANGE);
        _msg.setTradeSide(tradeSide);
        _msg.setVolume(volume);
        _msg.setBaseSlippagePrice(baseSlippagePrice);
        _msg.setSlippageInPips(slippageInPips);
        _msg.setTimeInForce(ProtoTimeInForce.IMMEDIATE_OR_CANCEL);
        _msg.setComment("TradingApiTest.CreateMarketRangeOrderRequest");

        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createLimitOrderRequest(long accountId, String accessToken, String symbolName, ProtoTradeSide tradeSide, long volume, double limitPrice) {
        return createLimitOrderRequest(accountId, accessToken, symbolName, tradeSide, volume, limitPrice, null);
    }


    public final ProtoMessage createLimitOrderRequest(long accountId, String accessToken, String symbolName, ProtoTradeSide tradeSide, long volume, double limitPrice, String clientMsgId) {
        ProtoOACreateOrderReq.Builder _msg = ProtoOACreateOrderReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setSymbolName(symbolName);
        _msg.setOrderType(ProtoOAOrderType.OA_LIMIT);
        _msg.setTradeSide(tradeSide);
        _msg.setVolume(volume);
        _msg.setLimitPrice(limitPrice);
        _msg.setTimeInForce(ProtoTimeInForce.IMMEDIATE_OR_CANCEL);
        _msg.setComment("TradingApiTest.CreateLimitOrderRequest");

        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createStopOrderRequest(long accountId, String accessToken, String symbolName, ProtoTradeSide tradeSide, long volume, double stopPrice) {
        return createStopOrderRequest(accountId, accessToken, symbolName, tradeSide, volume, stopPrice, null);
    }


    public final ProtoMessage createStopOrderRequest(long accountId, String accessToken, String symbolName, ProtoTradeSide tradeSide, long volume, double stopPrice, String clientMsgId) {
        ProtoOACreateOrderReq.Builder _msg = ProtoOACreateOrderReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setSymbolName(symbolName);
        _msg.setOrderType(ProtoOAOrderType.OA_STOP);
        _msg.setTradeSide(tradeSide);
        _msg.setVolume(volume);
        _msg.setStopPrice(stopPrice);
        _msg.setComment("TradingApiTest.CreateStopOrderRequest");


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createCancelOrderRequest(long accountId, String accessToken, long orderId) {
        return createCancelOrderRequest(accountId, accessToken, orderId, null);
    }


    public final ProtoMessage createCancelOrderRequest(long accountId, String accessToken, long orderId, String clientMsgId) {
        ProtoOACancelOrderReq.Builder _msg = ProtoOACancelOrderReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setOrderId(orderId);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createClosePositionRequest(long accountId, String accessToken, long positionId, long volume) {
        return createClosePositionRequest(accountId, accessToken, positionId, volume, null);
    }


    public final ProtoMessage createClosePositionRequest(long accountId, String accessToken, long positionId, long volume, String clientMsgId) {
        ProtoOAClosePositionReq.Builder _msg = ProtoOAClosePositionReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setPositionId(positionId);
        _msg.setVolume(volume);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAmendPositionStopLossRequest(long accountId, String accessToken, long positionId, double stopLossPrice) {
        return createAmendPositionStopLossRequest(accountId, accessToken, positionId, stopLossPrice, null);
    }


    public final ProtoMessage createAmendPositionStopLossRequest(long accountId, String accessToken, long positionId, double stopLossPrice, String clientMsgId) {
        ProtoOAAmendPositionStopLossTakeProfitReq.Builder _msg = ProtoOAAmendPositionStopLossTakeProfitReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setPositionId(positionId);
        _msg.setStopLossPrice(stopLossPrice);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAmendPositionTakeProfitRequest(long accountId, String accessToken, long positionId, double takeProfitPrice) {
        return createAmendPositionTakeProfitRequest(accountId, accessToken, positionId, takeProfitPrice, null);
    }


    public final ProtoMessage createAmendPositionTakeProfitRequest(long accountId, String accessToken, long positionId, double takeProfitPrice, String clientMsgId) {
        ProtoOAAmendPositionStopLossTakeProfitReq.Builder _msg = ProtoOAAmendPositionStopLossTakeProfitReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setPositionId(positionId);
        _msg.setTakeProfitPrice(takeProfitPrice);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAmendPositionProtectionRequest(long accountId, String accessToken, long positionId, double stopLossPrice, double takeProfitPrice) {
        return createAmendPositionProtectionRequest(accountId, accessToken, positionId, stopLossPrice, takeProfitPrice, null);
    }


    public final ProtoMessage createAmendPositionProtectionRequest(long accountId, String accessToken, long positionId, double stopLossPrice, double takeProfitPrice, String clientMsgId) {
        ProtoOAAmendPositionStopLossTakeProfitReq.Builder _msg = ProtoOAAmendPositionStopLossTakeProfitReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setPositionId(positionId);
        _msg.setStopLossPrice(stopLossPrice);
        _msg.setTakeProfitPrice(takeProfitPrice);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAmendLimitOrderRequest(long accountId, String accessToken, long orderId, double limitPrice) {
        return createAmendLimitOrderRequest(accountId, accessToken, orderId, limitPrice, null);
    }


    public final ProtoMessage createAmendLimitOrderRequest(long accountId, String accessToken, long orderId, double limitPrice, String clientMsgId) {
        ProtoOAAmendOrderReq.Builder _msg = ProtoOAAmendOrderReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setOrderId(orderId);
        _msg.setLimitPrice(limitPrice);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createAmendStopOrderRequest(long accountId, String accessToken, long orderId, double stopPrice) {
        return createAmendStopOrderRequest(accountId, accessToken, orderId, stopPrice, null);
    }


    public final ProtoMessage createAmendStopOrderRequest(long accountId, String accessToken, long orderId, double stopPrice, String clientMsgId) {
        ProtoOAAmendOrderReq.Builder _msg = ProtoOAAmendOrderReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setOrderId(orderId);
        _msg.setStopPrice(stopPrice);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createSubscribeForSpotsRequest(long accountId, String accessToken, String symbolName) {
        return createSubscribeForSpotsRequest(accountId, accessToken, symbolName, null);
    }


    public final ProtoMessage createSubscribeForSpotsRequest(long accountId, String accessToken, String symbolName, String clientMsgId) {
        ProtoOASubscribeForSpotsReq.Builder _msg = ProtoOASubscribeForSpotsReq.newBuilder();
        _msg.setAccountId(accountId);
        _msg.setAccessToken(accessToken);
        _msg.setSymblolName(symbolName);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createSubscribeForSpotsResponse(int subscriptionId) {
        return createSubscribeForSpotsResponse(subscriptionId, null);
    }


    public final ProtoMessage createSubscribeForSpotsResponse(int subscriptionId, String clientMsgId) {
        ProtoOASubscribeForSpotsRes.Builder _msg = ProtoOASubscribeForSpotsRes.newBuilder();
        _msg.setSubscriptionId(subscriptionId);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createUnsubscribeFromAllSpotsRequest() {
        return createUnsubscribeFromAllSpotsRequest(null);
    }


    public final ProtoMessage createUnsubscribeFromAllSpotsRequest(String clientMsgId) {
        ProtoOAUnsubscribeFromSpotsReq.Builder _msg = ProtoOAUnsubscribeFromSpotsReq.newBuilder();


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createUnsubscribeAccountFromSpotsRequest(int subscriptionId) {
        return createUnsubscribeAccountFromSpotsRequest(subscriptionId, null);
    }


    public final ProtoMessage createUnsubscribeAccountFromSpotsRequest(int subscriptionId, String clientMsgId) {
        ProtoOAUnsubscribeFromSpotsReq.Builder _msg = ProtoOAUnsubscribeFromSpotsReq.newBuilder();
        _msg.setSubscriptionId(subscriptionId);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createUnsubscribeFromSymbolSpotsRequest(String symbolName) {
        return createUnsubscribeFromSymbolSpotsRequest(symbolName, null);
    }


    public final ProtoMessage createUnsubscribeFromSymbolSpotsRequest(String symbolName, String clientMsgId) {
        ProtoOAUnsubscribeFromSpotsReq.Builder _msg = ProtoOAUnsubscribeFromSpotsReq.newBuilder();
        _msg.setSymblolName(symbolName);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createUnsubscribeAccountFromSymbolSpotsRequest(int subscriptionId, String symbolName) {
        return createUnsubscribeAccountFromSymbolSpotsRequest(subscriptionId, symbolName, null);
    }


    public final ProtoMessage createUnsubscribeAccountFromSymbolSpotsRequest(int subscriptionId, String symbolName, String clientMsgId) {
        ProtoOAUnsubscribeFromSpotsReq.Builder _msg = ProtoOAUnsubscribeFromSpotsReq.newBuilder();
        _msg.setSubscriptionId(subscriptionId);
        _msg.setSymblolName(symbolName);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createUnsubscribeFromSpotsResponse() {
        return createUnsubscribeFromSpotsResponse(null);
    }


    public final ProtoMessage createUnsubscribeFromSpotsResponse(String clientMsgId) {
        ProtoOAUnsubscribeFromSpotsRes.Builder _msg = ProtoOAUnsubscribeFromSpotsRes.newBuilder();


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createGetSpotSubscriptionRequest(int subscriptionId) {
        return createGetSpotSubscriptionRequest(subscriptionId, null);
    }


    public final ProtoMessage createGetSpotSubscriptionRequest(int subscriptionId, String clientMsgId) {
        ProtoOAGetSpotSubscriptionReq.Builder _msg = ProtoOAGetSpotSubscriptionReq.newBuilder();
        _msg.setSubscriptionId(subscriptionId);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createGetSpotSubscriptionResponse(ProtoOASpotSubscription spotSubscription) {
        return createGetSpotSubscriptionResponse(spotSubscription, null);
    }


    public final ProtoMessage createGetSpotSubscriptionResponse(ProtoOASpotSubscription spotSubscription, String clientMsgId) {
        ProtoOAGetSpotSubscriptionRes.Builder _msg = ProtoOAGetSpotSubscriptionRes.newBuilder();
        _msg.setSpotSubscription(spotSubscription);


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    public final ProtoMessage createGetAllSpotSubscriptionsRequest(int subscriptionId) {
        return createGetAllSpotSubscriptionsRequest(subscriptionId, null);
    }


    public final ProtoMessage createGetAllSpotSubscriptionsRequest(int subscriptionId, String clientMsgId) {
        ProtoOAGetAllSpotSubscriptionsReq.Builder _msg = ProtoOAGetAllSpotSubscriptionsReq.newBuilder();


        return createMessage(_msg.getPayloadType().getNumber(), _msg.build().toByteString(), clientMsgId);
    }

    ///#endregion


    ///#region Creating new Proto messages Builders

    public final ProtoOAGetAllSpotSubscriptionsRes.Builder createGetAllSpotSubscriptionsResponseBuilder() {
        return createGetAllSpotSubscriptionsResponseBuilder(null);
    }

    public final ProtoOAGetAllSpotSubscriptionsRes.Builder createGetAllSpotSubscriptionsResponseBuilder(String clientMsgId) {
        return ProtoOAGetAllSpotSubscriptionsRes.newBuilder();
    }

    public final ProtoOASpotEvent.Builder createSpotEventBuilder(int subscriptionId, String symbolName) {
        return createSpotEventBuilder(subscriptionId, symbolName, null);
    }


    public final ProtoOASpotEvent.Builder createSpotEventBuilder(int subscriptionId, String symbolName, String clientMsgId) {
        return ProtoOASpotEvent.newBuilder();
    }

    ///#endregion
}