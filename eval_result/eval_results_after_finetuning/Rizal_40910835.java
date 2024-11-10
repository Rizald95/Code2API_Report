

public String removeCharBeforeEquals(String testString) {
    if(testString.contains("=")){
        return testString.substring(testString.indexOf("=") + 1);
    } else {
        return testString;
    }
}

