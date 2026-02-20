package vupay;

import java.util.Scanner;

public class VUCourses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String moduleCode;
        String courseName = "";
        int tuition = 0;

        System.out.println("===== Victoria University Payment System =====");
        System.out.print("Enter Module Code: ");
        moduleCode = input.nextLine();

        switch(moduleCode) {

            case "BSF":
                courseName = "BSc. Software Engineering";
                tuition = 900000;
                break;

            case "BIT":
                courseName = "BSc. Information Technology";
                tuition = 750000;
                break;

            case "BCS":
                courseName = "BSc. Computer Science";
                tuition = 800000;
                break;

            case "BCE":
                courseName = "BSc. Computer Engineering";
                tuition = 950000;
                break;

            default:
                System.out.println("Wrong Module Code details");
                return;
        }

        System.out.println("\nCourse Name: " + courseName);
        System.out.println("Module Code: " + moduleCode);
        System.out.println("Tuition Fee: UGX " + tuition);

    }
}
