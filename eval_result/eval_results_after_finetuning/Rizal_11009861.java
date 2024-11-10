
public List<Integer> getIntegers(String number) {
    Scanner scanner = new Scanner(number);
    List<Integer> list = new ArrayList<Integer>();
    while (scanner.hasNextInt()) {
        list.add(scanner.nextInt());
    }
    return list;
}

