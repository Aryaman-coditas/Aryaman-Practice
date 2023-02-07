package Third_week;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Month in String: ");
        String input = sc.next();

        switch (input){
            case "one":
                System.out.println("January");
                break;

            case "two":
                System.out.println("February");
                break;

            case "three":
                System.out.println("March");
                break;

            case "four":
                System.out.println("April");
                break;

            case "five":
                System.out.println("May");
                break;

            case "six":
                System.out.println("June");
                break;

                case "seven":
                System.out.println("July");
                break;

            case "eight":
                System.out.println("August");
                break;

            case "nine":
                System.out.println("September");
                break;

            case "ten":
                System.out.println("October");
                break;

            case "eleven":
                System.out.println("November");
                break;

            case "twelve":
                System.out.println("December");
                break;

                default:
                System.out.println("Invalid Entry");
        }
    }
}
