import java.security.Permission;

public class Test {
    public static void main(String[] args) {
        // Set a custom security manager to intercept System.exit calls
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPermission(Permission perm) {
                // Allow everything else
            }

            @Override
            public void checkExit(int status) {
                // Intercept exit calls and throw an exception to prevent exiting
                throw new SecurityException("Intercepted exit with status: " + status);
            }
        });

        try {
            System.out.println("Before try");
            try {
                System.out.println("In try");
                System.exit(0);  // This will trigger the SecurityException and prevent actual exit
            } catch (Exception e) {
                System.out.println("In catch");
                System.exit(1);  // This will also trigger the SecurityException
            } finally {
                System.out.println("In finally");
                System.exit(2);  // This will also trigger the SecurityException
            }
        } catch (SecurityException e) {
            System.out.println("In outer catch: " + e.getMessage());
            System.exit(3);  // This will also trigger the SecurityException
        } finally {
            System.out.println("In outer finally");
            System.exit(4);  // This will also trigger the SecurityException
        }

        // Reset security manager to the default (null) if needed
        System.setSecurityManager(null);
    }
}
