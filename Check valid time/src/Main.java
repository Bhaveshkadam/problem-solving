public class Main {
    public static void main(String[] args) {
            String str1 = "13:05";
            System.out.println(str1 + ": " + CheckTime.isValidTime(str1));
            String str2 = "02:15";
            System.out.println(str2 + ": " + CheckTime.isValidTime(str2));
            String str3 = "24:00";
            System.out.println(str3 + ": " + CheckTime.isValidTime(str3));
            String str4 = "10:60";
            System.out.println(str4 + ": " + CheckTime.isValidTime(str4));
            String str5 = "18:60";
            System.out.println(str5 + ": " + CheckTime.isValidTime(str5));

    }
}