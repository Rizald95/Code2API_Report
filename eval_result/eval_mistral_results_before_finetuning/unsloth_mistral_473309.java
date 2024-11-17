public String padIntWithZeros(int number, int length) {
    return String.format("%0" + length + "d", number);
}