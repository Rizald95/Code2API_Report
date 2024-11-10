package com.stackoverflow.api;

import java.math.BigDecimal;

public class Human12460596 {

  public static String scaleDoublesFromString(
    String doubleVal,
    String doubleVal1
  ) {
    BigDecimal bdTest = new BigDecimal(doubleVal);
    BigDecimal bdTest1 = new BigDecimal(doubleVal1);
    bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);
    bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
    return "bdTest:" + bdTest + "; bdTest1:" + bdTest1;
  }
}
