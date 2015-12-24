package com.mycompany.app;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Created by sgologuzov on 29/05/2015.
 */
public class Utils {

    public static String getHexadecimal(byte[] byteArray) {
        StringBuilder hex = new StringBuilder(byteArray.length * 2);
        for (byte b : byteArray) {
            hex.append(String.format("%02x ", b));
        }
        return hex.toString();
    }

    public static  int fromArray(byte[] payload){
        ByteBuffer buffer = ByteBuffer.wrap(payload);
        buffer.order(ByteOrder.BIG_ENDIAN);
        return buffer.getInt();
    }

    public static byte[] toArray(int value){
        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.putInt(value);
        buffer.flip();
        return buffer.array();
    }
}
