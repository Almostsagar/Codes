import java.util.Scanner;

public class c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in the array : ");
        int ele = sc.nextInt();
        int arr[] = new int[ele];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The biggest element of the array is : " + max);
        sc.close();
    }
}
