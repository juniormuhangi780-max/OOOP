package leapmonth;

import java.util.Scanner;

public class LeapMonth {

    int year;
    int month;
    boolean isLeapMonth;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;
        int month;
        boolean isLeapMonth;

        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        month = input.nextInt();

        isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0);
        isLeapMonth = isLeapMonth || (year % 400 == 0);

        if(isLeapMonth && month == 2) {

            System.out.println("February in " + year + " is a Leap Month.");

        } else {

            System.out.println("This is NOT a Leap Month.");

        }

        input.close();

    }

}
