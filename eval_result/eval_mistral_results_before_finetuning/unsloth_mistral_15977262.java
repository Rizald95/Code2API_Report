public static void main(String[] args) {
    String someString = "STRING";
    byte someByte = 0x10;
    someString += Byte.toString(someByte);
    System.out.println(someString);
}