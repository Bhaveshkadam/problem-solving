# Fibonacci Series

* In mathematics, the Fibonacci numbers, commonly denoted Fn , form a sequence, the Fibonacci sequence, in which each
  number is the sum of the two preceding ones. The sequence commonly starts from 0 and 1, although some authors start
  the sequence from 1 and 1 or sometimes (as did Fibonacci) from 1 and 2. Starting from 0 and 1, the first few values in
  the sequence are

  ``0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
  ``


* **CODE**

````
    public class Main {
    public static void main(String[] args) {
            int count = 11;
            int num1 = 0;
            int num2 = 1;
            for (int i = 0; i <= count; i++) {
                int sum = num1 + num2;
                System.out.print(" " + num1);
                num1 = num2;
                num2 = sum;
            }
        }
    }