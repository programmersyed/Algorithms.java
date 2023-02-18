public class LinearSearch {
    //Big O = O(n) only for small to medium data sets and does not need to be sorted
    public static void main(String[] args) {
        int[] array = {5, 4, 4, 4, 3, 2, 32, 3, 23, 5};
        int index = linearSearch(array, 4);
        if (index != -1) {
            System.out.println("Hurray, its found");
        } else System.out.println("Not available");

    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


}
