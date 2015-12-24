package com.mycompany.app;

import com.google.protobuf.InvalidProtocolBufferException;
import com.xtrader.protocol.proto.commons.ProtoMessage;
import com.xtrader.protocol.proto.openapi.ProtoOAExecutionEvent;
import com.xtrader.protocol.proto.openapi.ProtoOASpotEvent;
import com.xtrader.protocol.proto.openapi.model.ProtoOAPayloadType;

import javax.swing.*;
import javax.xml.bind.DatatypeConverter;
import java.util.Base64;

/**
 * Created by sgologuzov on 21/12/2015.
 */
public class ReadMessageTest {
    static String length = "00000096";
    static String encoded = "08e00f12900110011a4808ab8c261083b905180120012a06455552555344300038a08d0640009001009801ffecdfa09c2ab2011b476f6f676c65204f4175746820322e3020506c617967726f756e64d001002242088fba171083b905180320012a064555525553443000390000000000000000400048005000721b476f6f676c65204f4175746820322e3020506c617967726f756e64";
    private static OpenApiMessagesFactory incomingMsgFactory = new OpenApiMessagesFactory();
    private static boolean isDebugIsOn = true;

    public static byte[] toByteArray(String s) {
        return DatatypeConverter.parseHexBinary(s);
    }
    private static void processIncomingDataStream(OpenApiMessagesFactory msgFactory, byte[] rawData) throws InvalidProtocolBufferException {
        ProtoMessage _msg = msgFactory.getMessage(rawData);
        if (isDebugIsOn) {
            System.out.printf("ProcessIncomingDataStream() Message received:\n%1$s" + "\r\n", OpenApiMessagesPresentation.toString(_msg));
        }
        if (!_msg.hasPayload()) {
            return;
        }

        if (_msg.getPayloadType() == ProtoOAPayloadType.OA_EXECUTION_EVENT.getNumber()) {
            ProtoOAExecutionEvent _payload_msg = msgFactory.GetExecutionEvent(rawData);
        } else if (_msg.getPayloadType() == ProtoOAPayloadType.OA_SPOT_EVENT.getNumber()) {
            ProtoOASpotEvent spotEventMsg = msgFactory.GetSpotEvent(rawData);
        }
    }

    public static void main (String[] args) {
        byte[] _message = toByteArray(encoded);
        try {
            processIncomingDataStream(incomingMsgFactory, _message);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}
