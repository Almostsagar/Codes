import java.util.*;

class keyBoardInputString {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        sc.useRadix(2);
        int x = sc.nextInt();

        System.out.println("The value is :" + x);
        sc.close();
    }
}