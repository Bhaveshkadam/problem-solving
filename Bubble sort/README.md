# Bubble Sort

### Write a function that takes in an array of integers and returns a sorted version of that array. Use the Bubble Sort algorithm to sort the array.


## Sample Input

array = [8, 5, 2, 9, 5, 6, 3]

## Sample Output 

[2, 3, 5, 5, 6, 8, 9]

## code :  

### using for loop

 ```
import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
   for(int i=0; i < array.length; i++) { 
      for(int j=1; j < (array.length-i); j++) {
         if(array[j-1] > array[j]){
           int temp = array[j-1];
           array[j-1] = array[j];
           array[j] = temp;
           }
        }
     }
    return array;
    }
}
```
### using while loop


```
import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
     boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    return array;
  }
}
``` 
