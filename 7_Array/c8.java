import java.util.Scanner;

public class c8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the " + size + " elements into the array : ");
        for (int i = 0; i <= 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Element to be inserted at index : ");
        int atIndex = sc.nextInt();
        System.out.println("Element to be inserted : ");
        int ele = sc.nextInt();
        for (int i = arr.length-2; i >= atIndex; i--) {
            arr[i+1] = arr[i];
        }
        arr[atIndex] = ele;
        System.out.println("After element insertion, elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
