public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a is " + a + "and b is " + b);
        a = a + b; //   a = 30

        System.out.println(a);
        b = a - b; //   b = 10
        System.out.println(b);
        a = a - b; //   a = 30 - 10
        System.out.println(a);

        System.out.println("After swapping, a is " + a + " and b is " + b);
    }
}