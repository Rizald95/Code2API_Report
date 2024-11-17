public String escapeDoubleQuotes(String text) {
    return text.replaceAll("\\\"", "\"")
               .replaceAll("\"\"", "\"");
}