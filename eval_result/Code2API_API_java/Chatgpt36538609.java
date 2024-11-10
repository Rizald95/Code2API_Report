package com.chatgpt.api;
public class Chatgpt36538609 {
    public static String[] getSpecificValues(String[] arrayOne) {
        int validCounter = 0;
        for(int i = 0; i < arrayOne.length; i++)
          if(!(arrayOne[i].equals("65535") || arrayOne[i].equals("00000")))
              validCounter++;

        String[] arrayTwo = new String[validCounter];
        int arrayTwoPos = 0;
        for(int i = 0; i < arrayOne.length; i++)
          if(!(arrayOne[i].equals("65535") || arrayOne[i].equals("00000"))){
              arrayTwo[arrayTwoPos] = arrayOne[i];
              arrayTwoPos++;
          }
        return arrayTwo;
    }
}
