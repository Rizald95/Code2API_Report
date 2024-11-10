

    public static String getOsInfo() {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");
        
        return osName + " " + osVersion + " " + osArch;
    }


