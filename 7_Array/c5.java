import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in the array : ");
        int ele = sc.nextInt();
        int arr[] = new int[ele];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("The biggest element of the array is : " + max1);
        System.out.println("The Second biggest element of the array is : " + max2);
        sc.close();
    }
}
