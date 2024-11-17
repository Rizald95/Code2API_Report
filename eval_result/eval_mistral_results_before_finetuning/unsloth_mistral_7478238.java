public String[] findWords(char[] array) {
    String s = new String(array);
    String[] words = s.split("\\s+");
    return words;
}