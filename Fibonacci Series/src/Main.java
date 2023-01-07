

public class Main {
    private static long[] fibonacci;
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacci(n));
        fibonacci = new long[n +1];
//        for (int i = 0; i<= n; i++) {
//            System.out.print(fibonacci(i)+" ");
//        }
        System.out.println(fibonacci(n));

    }
    public static long fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        if (fibonacci[n] != 0){
            return fibonacci[n];
        }
        long fibonacciNumber = (fibonacci(n -1 )+ fibonacci(n -2));
        fibonacci[n]= fibonacciNumber;
        return fibonacciNumber;
    }

}