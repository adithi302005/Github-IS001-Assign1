package Mod1;


 import java.util.Scanner;

    public class GradeSwitch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            char grade;

            if (marks >= 90)
                grade = 'A';
            else if (marks >= 75)
                grade = 'B';
            else if (marks >= 60)
                grade = 'C';
            else if (marks >= 40)
                grade = 'D';
            else
                grade = 'F';

            switch (grade) {
                case 'A': System.out.println("Excellent"); break;
                case 'B': System.out.println("Good"); break;
                case 'C': System.out.println("Average"); break;
                case 'D': System.out.println("Pass"); break;
                default: System.out.println("Fail");
            }
        }
    }

