import java.util.Scanner;

class a8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap year");

                } else {
                    System.out.println("Not a Leap year");
                }
            } else {
                System.out.println("leap year");

            }
        } else {
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}