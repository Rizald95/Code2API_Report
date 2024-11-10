

    public static String wrapString(String str) {
        String temp = "";
        if(str !=null && str.length() > 10) {
            temp = str.substring(0, 10) + "...."; // here 0 is start index and 10 is last index
        } else {
            temp = str;
        }
        return temp;
    }

