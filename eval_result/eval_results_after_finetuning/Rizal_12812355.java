public String[] removeItemFromArray(String[] arr, String item) {
    List<String> list = new ArrayList<String>(Arrays.asList(arr));
    list.remove(item);
    return list.toArray(new String[0]);
}