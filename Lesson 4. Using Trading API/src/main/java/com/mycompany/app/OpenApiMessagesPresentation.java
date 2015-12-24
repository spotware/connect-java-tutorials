package com.mycompany.app;

import com.google.protobuf.InvalidProtocolBufferException;
import com.xtrader.protocol.proto.commons.*;
import com.xtrader.protocol.proto.commons.model.*;
import com.xtrader.protocol.proto.openapi.*;
import com.xtrader.protocol.proto.openapi.model.*;

public class OpenApiMessagesPresentation {
    private static String protoMessageToString(ProtoMessage msg) throws InvalidProtocolBufferException {
        if (!msg.hasPayload()) {
            return "ERROR in ProtoMessage: Corrupted execution event, no payload found";
        }
        String _str = "ProtoMessage{";
        ProtoPayloadType protoPayloadType = ProtoPayloadType.valueOf(msg.getPayloadType());
        if (protoPayloadType == null) {
            _str += openApiMessageToString(msg);
        } else {
            switch (protoPayloadType) {
                case PING_REQ:
                    ProtoPingReq _ping_req = ProtoPingReq.newBuilder().mergeFrom(msg.getPayload()).build();
                    _str += "PingRequest{timestamp:" + (new Long(_ping_req.getTimestamp())).toString() + "}";
                    break;
                case PING_RES:
                    ProtoPingRes _ping_res = ProtoPingRes.newBuilder().mergeFrom(msg.getPayload()).build();
                    _str += "PingResponse{timestamp:" + _ping_res.getTimestamp() + "}";
                    break;
                case HEARTBEAT_EVENT:
                    ProtoHeartbeatEvent _hb = ProtoHeartbeatEvent.newBuilder().mergeFrom(msg.getPayload()).build();
                    _str += "Heartbeat";
                    break;
                case ERROR_RES:
                    ProtoErrorRes _err = ProtoErrorRes.newBuilder().mergeFrom(msg.getPayload()).build();
                    _str += "ErrorResponse{errorCode:" + _err.getErrorCode() + (_err.hasDescription() ? ", description:" + _err.getDescription() : "") + "}";
                    break;
                default:
                    break;
            }
        }
        _str += (msg.hasClientMsgId() ? ", clientMsgId:" + msg.getClientMsgId() : "") + "}";

        return _str;
    }

    private static String openApiMessageToString(ProtoMessage msg) throws InvalidProtocolBufferException {
        switch (ProtoOAPayloadType.valueOf(msg.getPayloadType())) {
            case OA_AUTH_REQ:
                ProtoOAAuthReq _auth_req = ProtoOAAuthReq.newBuilder().mergeFrom(msg.getPayload()).build();
                return "authRequest{clientId:" + _auth_req.getClientId() + ", clientSecret:" + _auth_req.getClientSecret() + "}";
            case OA_AUTH_RES:
                return "authResponse";
            case OA_GET_SUBSCRIBED_ACCOUNTS_REQ:
                return "getSubscribedAccountsRequest";
            case OA_GET_SUBSCRIBED_ACCOUNTS_RES:
                ProtoOAGetSubscribedAccountsRes _subscr_res = ProtoOAGetSubscribedAccountsRes.newBuilder().mergeFrom(msg.getPayload()).build();
                String _subscr_res_str = "getSubscribedAccountsResponse{";
                int _subscr_count = _subscr_res.getAccountIdCount();
                for (long accountId : _subscr_res.getAccountIdList()) {
                    _subscr_res_str += "accountId:" + (new Long(accountId)).toString() + (--_subscr_count == 0 ? "" : ", ");
                }
                return _subscr_res_str + "}";
            case OA_SUBSCRIBE_FOR_TRADING_EVENTS_REQ:
                ProtoOASubscribeForTradingEventsReq _subscr_req = ProtoOASubscribeForTradingEventsReq.newBuilder().mergeFrom(msg.getPayload()).build();
                return "subscrbeTradingEventsRequest{accountId:" + (new Long(_subscr_req.getAccountId())).toString() + ", accessToken:" + _subscr_req.getAccessToken() + "}";
            case OA_SUBSCRIBE_FOR_TRADING_EVENTS_RES:
                return "subscrbeTradingEventsResponse";
            case OA_UNSUBSCRIBE_FROM_TRADING_EVENTS_REQ:
                ProtoOAUnsubscribeFromTradingEventsReq _unsubscr_req = ProtoOAUnsubscribeFromTradingEventsReq.newBuilder().mergeFrom(msg.getPayload()).build();
                return "unsubscrbeTradingEventsRequest{accountId:" + _unsubscr_req.getAccountId() + "}";
            case OA_UNSUBSCRIBE_FROM_TRADING_EVENTS_RES:
                return "unsubscrbeTradingEventsResponse";
            case OA_EXECUTION_EVENT:
                return openApiExecEventsToString(msg);
            case OA_CANCEL_ORDER_REQ:
                return "cancelOrderRequest{}";
            case OA_CREATE_ORDER_REQ:
                return "createOrderRequest{}";
            case OA_CLOSE_POSITION_REQ:
                return "closePositionRequest{}";
            case OA_AMEND_ORDER_REQ:
                return "amendOrderRequest{}";
            case OA_AMEND_POSITION_SL_TP_REQ:
                return "amendPositionRequest{}";
            case OA_SUBSCRIBE_FOR_SPOTS_REQ:
                return "subscribeForSpotsRequest{}";
            case OA_SUBSCRIBE_FOR_SPOTS_RES:
                return "subscribeForSpotsResponse{}";
            case OA_UNSUBSCRIBE_FROM_SPOTS_REQ:
                return "unsubscribeFromSpotsRequest{}";
            case OA_UNSUBSCRIBE_FROM_SPOTS_RES:
                return "unsubscribeFromSpotsResponse{}";
            case OA_GET_SPOT_SUBSCRIPTION_REQ:
                return "getSpotSubscriptionRequest{}";
            case OA_GET_SPOT_SUBSCRIPTION_RES:
                return "getSpotSubscriptionResponse{}";
            case OA_GET_ALL_SPOT_SUBSCRIPTIONS_REQ:
                return "getAllSpotSubscriptionsRequest{}";
            case OA_GET_ALL_SPOT_SUBSCRIPTIONS_RES:
                return "getAllSpotSubscriptionsResponse{}";
            case OA_SPOT_EVENT:
                ProtoOASpotEvent _spot_event = ProtoOASpotEvent.newBuilder().mergeFrom(msg.getPayload()).build();
                return "spotEvent{subscriptionId:" + _spot_event.getSubscriptionId() + ", symbolName:" + _spot_event.getSymbolName() + ", bidPrice:" + (_spot_event.hasBidPrice() ? (new Double(_spot_event.getBidPrice())).toString() : "       ") + ", askPrice:" + (_spot_event.hasAskPrice() ? (new Double(_spot_event.getAskPrice())).toString() : "       ") + "}";
            default:
                return "unknown";
        }
    }

    private static String openApiExecutionTypeToString(ProtoOAExecutionType executionType) {
        switch (executionType) {
            case OA_ORDER_ACCEPTED:
                return "OrderAccepted";
            case OA_ORDER_AMENDED:
                return "OrderAmended";
            case OA_ORDER_CANCEL_REJECTED:
                return "OrderCancelRejected";
            case OA_ORDER_CANCELLED:
                return "OrderCancelled";
            case OA_ORDER_EXPIRED:
                return "OrderExpired";
            case OA_ORDER_FILLED:
                return "OrderFilled";
            case OA_ORDER_REJECTED:
                return "OrderRejected";
            default:
                return "unknown";
        }
    }

    private static String openApiExecEventsToString(ProtoMessage msg) throws InvalidProtocolBufferException {
        if (ProtoOAPayloadType.valueOf(msg.getPayloadType()) != ProtoOAPayloadType.OA_EXECUTION_EVENT) {
            return "ERROR in openApiExecutionEvents: Wrong message type";
        }

        if (!msg.hasPayload()) {
            return "ERROR in openApiExecutionEvents: Corrupted execution event, no payload found";
        }

        ProtoOAExecutionEvent _msg = ProtoOAExecutionEvent.newBuilder().mergeFrom(msg.getPayload()).build();
        String _str = openApiExecutionTypeToString(_msg.getExecutionType()) + "{" + openApiOrderToString(_msg.getOrder()) + (_msg.hasPosition() ? ", " + openApiPositionToString(_msg.getPosition()) : "") + (_msg.hasReasonCode() ? ", reasonCode:" + _msg.getReasonCode() : "");

        return _str + "}";
    }

    public static String openApiOrderTypeToString(ProtoOAOrderType orderType) {
        switch (orderType) {
            case OA_LIMIT:
                return "LIMIT";
            case OA_MARKET:
                return "MARKET";
            case OA_MARKET_RANGE:
                return "MARKET RANGE";
            case OA_PROTECTION:
                return "PROTECTION";
            case OA_STOP:
                return "STOP";
            default:
                return "unknown";
        }
    }

    public static String tradeSideToString(ProtoTradeSide tradeSide) {
        switch (tradeSide) {
            case BUY:
                return "BUY";
            case SELL:
                return "SELL";
            default:
                return "unknown";
        }
    }

    public static String openApiOrderToString(ProtoOAOrder order) {
        String _str = "Order{orderId:" + (new Long(order.getOrderId())).toString() + ", accountId:" + order.getAccountId() + ", orderType:" + openApiOrderTypeToString(order.getOrderType());
        _str += ", tradeSide:" + tradeSideToString(order.getTradeSide());
        _str += ", symbolName:" + order.getSymbolName() + ", requestedVolume:" + (new Long(order.getRequestedVolume())).toString() + ", executedVolume:" + (new Long(order.getExecutedVolume())).toString() + ", closingOrder:" + (order.getClosingOrder() ? "TRUE" : "FALSE") + (order.hasExecutionPrice() ? ", executionPrice:" + (new Double(order.getExecutionPrice())).toString() : "") + (order.hasLimitPrice() ? ", limitPrice:" + (new Double(order.getLimitPrice())).toString() : "") + (order.hasStopPrice() ? ", stopPrice:" + (new Double(order.getStopPrice())).toString() : "") + (order.hasStopLossPrice() ? ", stopLossPrice:" + (new Double(order.getStopLossPrice())).toString() : "") + (order.hasTakeProfitPrice() ? ", takeProfitPrice:" + (new Double(order.getTakeProfitPrice())).toString() : "") + (order.hasBaseSlippagePrice() ? ", baseSlippagePrice:" + (new Double(order.getBaseSlippagePrice())).toString() : "") + (order.hasSlippageInPips() ? ", slippageInPips:" + (new Long(order.getSlippageInPips())).toString() : "") + (order.hasRelativeStopLossInPips() ? ", relativeStopLossInPips:" + (new Integer(order.getRelativeStopLossInPips())).toString() : "") + (order.hasRelativeTakeProfitInPips() ? ", relativeTakeProfitInPips:" + (new Integer(order.getRelativeTakeProfitInPips())).toString() : "") + (order.hasCommission() ? ", commission:" + (new Long(order.getCommission())).toString() : "") + (order.hasOpenTimestamp() ? ", openTimestamp:" + (new Long(order.getOpenTimestamp())).toString() : "") + (order.hasCloseTimestamp() ? ", closeTimestamp:" + (new Long(order.getCloseTimestamp())).toString() : "") + (order.hasExpirationTimestamp() ? ", expirationTimestamp:" + (new Long(order.getExpirationTimestamp())).toString() : "") + (order.hasChannel() ? ", channel:" + order.getChannel() : "") + (order.hasComment() ? ", comment:" + order.getComment() : "") + (order.hasClosePositionDetails() ? ", " + openApiClosePositionDetails(order.getClosePositionDetails()) : "");

        return _str + "}";
    }

    public static String openApiPositionStatusToString(ProtoOAPositionStatus positionStatus) {
        switch (positionStatus) {
            case OA_POSITION_STATUS_CLOSED:
                return "CLOSED";
            case OA_POSITION_STATUS_OPEN:
                return "OPENED";
            default:
                return "unknown";
        }
    }

    public static String openApiPositionToString(ProtoOAPosition position) {
        String _str = "Position{positionId:" + (new Long(position.getPositionId())).toString() + ", positionStatus:" + openApiPositionStatusToString(position.getPositionStatus()) + ", accountId:" + (new Long(position.getAccountId())).toString();
        _str += ", tradeSide:" + tradeSideToString(position.getTradeSide());
        _str += ", symbolName:" + position.getSymbolName() + ", volume:" + (new Long(position.getVolume())).toString() + ", entryPrice:" + (new Double(position.getEntryPrice())).toString() + ", swap:" + (new Long(position.getSwap())).toString() + ", commission:" + (new Long(position.getCommission())).toString() + ", openTimestamp:" + (new Long(position.getOpenTimestamp())).toString() + (position.hasCloseTimestamp() ? ", closeTimestamp:" + (new Long(position.getCloseTimestamp())).toString() : "") + (position.hasStopLossPrice() ? ", stopLossPrice:" + (new Double(position.getStopLossPrice())).toString() : "") + (position.hasTakeProfitPrice() ? ", takeProfitPrice:" + (new Double(position.getTakeProfitPrice())).toString() : "") + (position.hasChannel() ? ", channel:" + position.getChannel() : "") + (position.hasComment() ? ", comment:" + position.getComment() : "");

        return _str + "}";
    }

    public static String openApiClosePositionDetails(ProtoOAClosePositionDetails closePositionDetails) {
        return "closePositionDetails{entryPrice:" + (new Double(closePositionDetails.getEntryPrice())).toString() + ", profit:" + (new Long(closePositionDetails.getProfit())).toString() + ", swap:" + (new Long(closePositionDetails.getSwap())).toString() + ", commission:" + (new Long(closePositionDetails.getCommission())).toString() + ", balance:" + (new Long(closePositionDetails.getBalance())).toString() + (closePositionDetails.hasComment() ? ", comment:" + closePositionDetails.getComment() : "") + (closePositionDetails.hasStopLossPrice() ? ", stopLossPrice:" + (new Double(closePositionDetails.getStopLossPrice())).toString() : "") + (closePositionDetails.hasTakeProfitPrice() ? ", takeProfitPrice:" + (new Double(closePositionDetails.getTakeProfitPrice())).toString() : "") + (closePositionDetails.hasQuoteToDepositConversionRate() ? ", quoteToDepositConversionRate:" + (new Double(closePositionDetails.getQuoteToDepositConversionRate())).toString() : "") + ", closedVolume:" + (new Long(closePositionDetails.getClosedVolume())).toString() + ", closedByStopOut:" + (closePositionDetails.getClosedByStopOut() ? "TRUE" : "FALSE") + "}";
    }

    public static String toString(ProtoMessage msg) throws InvalidProtocolBufferException {
        return protoMessageToString(msg);
    }
}