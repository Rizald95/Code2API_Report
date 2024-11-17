public class Main {
    public static void main(String[] args) {
        int something = 0;
        int[] array;
        switch (something) {
            case 0: array = new int[] {1, 2, 3}; break;
            default: array = new int[] {3, 2, 1};
        }
        System.out.println(array[0]);
    }
}