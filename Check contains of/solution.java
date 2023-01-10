import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "what is the year of independence day?";
        System.out.println(s1);
        String s2 = scanner.nextLine();
        System.out.println(check(s1, s2));
    }

    static Map<String, String> questionAnswer = new HashMap<>();

    static {
        questionAnswer.put("what is the year of independence day?", "1947");
        questionAnswer.put("What is your name?", "bhavesh");
    }

    static boolean check(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        
        String ans = questionAnswer.get(s1);

        if (ans == null){
            return false;
        }

        return s2.contains(ans);
    }
}
