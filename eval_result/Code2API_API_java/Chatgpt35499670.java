package com.chatgpt.api;
public class Chatgpt35499670 {
    public static String compareNames(Name name1, Name name2) {
        if (name1.compareTo(name2) < 0) {
            return name1.getName() + " is before than " + name2.getName();
        } else if (name1.compareTo(name2) > 0) {
            return name1.getName() + " is after than " + name2.getName();
        } else if (name1.compareTo(name2) == 0) {
            return name1.getName() + " is equals to " + name2.getName();
        }
    }
}
