import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        System.out.println("Enter the marks of student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English");
        int marksOfEnglish = sc.nextInt();
        System.out.println("Enter the marks of Chemistry");
        int marksOfChemistry = sc.nextInt();
        System.out.println("Enter the marks of Maths");
        int marksOfMaths = sc.nextInt();
        int total = marksOfChemistry + marksOfEnglish + marksOfMaths;
        System.out.println("Total marks is : " + total + "/300");
        float marks = (float) total / 3;
        System.out.println("Average marks is : " + marks + "/100");
        if (marksOfChemistry >= 33 && marksOfEnglish >= 33 && marksOfMaths >= 33) {
            if (marks >= 90 && marks <= 100) {
                System.out.println("A Grade");
            } else if (marks >= 80 && marks <= 89) {
                System.out.println("B Grade");
            } else if (marks >= 70 && marks <= 79) {
                System.out.println("C Grade");
            } else if (marks >= 60 && marks <= 69) {
                System.out.println("D Grade");
            } else if (marks >= 50 && marks <= 59) {
                System.out.println("E Grade");
            } else if (marks >= 40 && marks <= 49) {
                System.out.println("Work hard");
            } else if (marks < 39) {
                System.err.println("Fail");
            } else {
                System.out.println("Enter a correct number");
            }
        } else {
            System.out.println("Student has failed!!!");
        }
        sc.close();
    }
}
