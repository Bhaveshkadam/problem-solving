# Insertion Sort

### Write a function that takes in an array of integers and returns a sorted version of that array. Use the insertion Sort algorithm to sort the array.


## Sample Input

* Unsorted array = [8, 5, 2, 9, 5, 6, 3]

## Sample Output 

* Sorted array: [2, 3, 5, 5, 6, 8, 9]

## code :  

````
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

class Insertion {
    public int[] insertionSort(int[] array) {
        int i;
        int n = array.length;
        for (i = 1; i < n; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }
}
