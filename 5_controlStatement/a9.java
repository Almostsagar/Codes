import java.util.Scanner;

class a9 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int day = sc.nextInt();
      if (day == 1) {
         System.out.println("Mon");
      } else if (day == 2) {
         System.out.println("Tue");
      } else if (day == 3) {
         System.out.println("Wed");
      } else if (day == 4) {
         System.out.println("Thu");
      } else if (day == 5) {
         System.out.println("Fri");
      } else if (day == 6) {
         System.out.println("Saturday");
      } else if (day == 7) {
         System.out.println("Sunday");
      } else {
         System.out.println("Invalid");
      }
      sc.close();

   }
}