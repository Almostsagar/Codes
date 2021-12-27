import java.util.Scanner;
public class c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in the array : ");
        int ele = sc.nextInt();
        int arr[] = new int[ele];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.println("The elements of the array are : ");
        for (int i : arr) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum of the array is : "+ sum);
        sc.close();
    }
}
