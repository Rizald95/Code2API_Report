package com.chatgpt.api;
import java.util.ArrayList;
import java.util.List;

public class Chatgpt7063917 {
    public static CharSequence[] populateCharSequenceArray() {
        List<String> listItems = new ArrayList<String>();

        listItems.add("Item1");
        listItems.add("Item2");
        listItems.add("Item3");

        final CharSequence[] charSequenceItems = listItems.toArray(new CharSequence[listItems.size()]);
        return charSequenceItems;
    }
}
