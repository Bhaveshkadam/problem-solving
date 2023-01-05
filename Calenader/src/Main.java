import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month;
        String monthString;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month from 1 to 12 : ");
        month = sc.nextInt();

        switch (month) {
            case 1:
                monthString = "January";
                break;

            case 2:
                monthString = "February";
                break;

            case 3:
                monthString = "march";
                break;

            case 4:
                monthString = "april";
                break;

            case 5:
                monthString = "May";
                break;

            case 6:
                monthString = "june";
                break;

            case 7:
                monthString = "july";
                break;

            case 8:
                monthString = "August";
                break;

            case 9:
                monthString = "September";
                break;

            case 10:
                monthString = "October";
                break;

            case 11:
                monthString = "November";
                break;

            case 12:
                monthString = "December";
                break;

            default:
                monthString = "Invalid Month";
        }
        System.out.println(monthString);


        String months;
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter Month from January to December : ");
        months = sca.next();

        switch (months) {
            case "January":
            case "march":
            case "May":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days in " + months + " month");
                break;

            case "april":
            case "june":
            case "September":
            case "November":
                System.out.println("30 Days in " + months + " Month");
                break;

            case "February":
                System.out.println("28 Days in" + months + " month");
                System.out.println("if leap year 29 Days in month");
                break;

            default:
                System.out.println("Month not found Please enter valid month");
        }
    }
}