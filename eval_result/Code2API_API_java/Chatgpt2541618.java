package com.chatgpt.api;
public class Chatgpt2541618 {
    public static void handleKillSignal() throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Shutdown hook ran!");
            }
        });

        while (true)
        {
            Thread.sleep(1000);
        }
    }
}
