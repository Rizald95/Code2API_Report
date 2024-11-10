package com.chatgpt.api;
import java.security.Permission;

public class Chatgpt1410961 {
    public static void checkExitBehavior(String... argv) throws Exception {
        System.setSecurityManager(new SecurityManager() {

            @Override
            public void checkPermission(Permission perm) {
                /* Allow everything else. */
            }

            @Override
            public void checkExit(int status) {
                /* Don't allow exit with any status code. */
                throw new SecurityException();
            }

        });
        System.err.println("I'm dying!");
        try {
            System.exit(0);
        } finally {
            System.err.println("I'm not dead yet!");
            System.exit(1);
        }
    }
}
