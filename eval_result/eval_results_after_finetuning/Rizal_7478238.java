public String[] splitStringByWhitespace(char[] array){
    String s = new String(array);
    String[] words = s.split("\\s+");
    return words;
}