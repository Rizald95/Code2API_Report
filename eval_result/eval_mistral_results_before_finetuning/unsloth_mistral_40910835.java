public String extractValue(String input) {
    int index = input.indexOf("=");
    if (index != -1) {
        return input.substring(index + 1).trim();
    }
    return null;
}