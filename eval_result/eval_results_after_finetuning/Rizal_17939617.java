

    public static String getCurrentPath() {
        String currentPath = System.getProperty("user.dir");
    
        System.out.println(currentPath);
    
        return currentPath;
    }


You can run the method from your main method as:

    public static void main(String args[]) {
        getCurrentPath();
    }



