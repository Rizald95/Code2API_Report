public static List<Integer> convertIntArrayToList(int[] intArray) {
    List<Integer> intList = new ArrayList<Integer>(intArray.length);
    for (int i : intArray) {
        intList.add(i);
    }
    return intList;
}