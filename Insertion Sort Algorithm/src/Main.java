import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Insertion sort = new Insertion();
        int[] array = {8, 5, 3, 8, 1, 1, 0, -2};
        System.out.println("Unsorted array :"+Arrays.toString(array));
        sort.insertionSort(array);
        System.out.println("Sorted array :"+Arrays.toString(array));
    }
}