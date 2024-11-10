public static List<Integer> intArrayToList(int[] ints) {
    List<Integer> intList = new ArrayList<Integer>(ints.length);
    for (int i : ints)
    {
        intList.add(i);
    }
    return intList;
}