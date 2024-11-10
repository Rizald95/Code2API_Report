public String replaceNameInMessage(String message, String name) {
    return message.replaceAll("%%NAME", name);
}