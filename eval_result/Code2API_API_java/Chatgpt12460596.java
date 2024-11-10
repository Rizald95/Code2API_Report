package com.chatgpt.api;
import java.math.BigDecimal;

public class Chatgpt12460596 {
    public static void roundDoubleValue(String doubleVal, String doubleVal1) {
        BigDecimal bdTest = new BigDecimal(doubleVal);
        BigDecimal bdTest1 = new BigDecimal(doubleVal1);
        bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);
        bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("bdTest:" + bdTest); //1.75
        System.out.println("bdTest1:" + bdTest1);//0.75, no problem
    }
}
