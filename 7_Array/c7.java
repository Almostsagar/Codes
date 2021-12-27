import java.util.Scanner;

public class c7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the " + size + " elements into the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int temp = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        System.out.println();
        System.out.println("Elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

// 1 2 3 4 5 
// 2 3 4 5 1

// 1 2 3 4 5
// 5 1 2 3 4          