public String[] getParts(String theString) {
    String[] parts = theString.split("-");
    String first = parts[0];
    String second = parts[1];
    return new String[] {first, second};
}