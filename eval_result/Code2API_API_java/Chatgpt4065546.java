package com.chatgpt.api;
public class Chatgpt4065546 {
    public static String getCallerFunctionName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];//maybe this number needs to be corrected
        String methodName = e.getMethodName();
        return methodName;
    }
}
