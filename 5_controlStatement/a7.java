import java.util.Scanner;

public class a7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
       String num = sc.nextLine();
       if (num.matches("[01]+")) {
           System.out.println("Binary ,Radix - 2");
       } else if (num.matches("[0-7]+")) {
        System.out.println("Octal ,Radix - 8");
    } else if (num.matches("[0-9]+")) {
        System.out.println("Decimal ,Radix - 9");
    } else if (num.matches("[0-9A-F]+")) {
        System.out.println("Hexadecimal ,Radix - 17");
    } else{
        System.out.println("Invalid");
    }
        sc.close();
    }
}
