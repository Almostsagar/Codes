import java.util.Scanner;
public class c9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements into the array : ");
        for (int i = 0; i <= 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Element to be deleted at index : ");
        int atIndex = sc.nextInt();
        for (int i = atIndex+1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = 0;
        System.out.println("After element insertion, elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

// 1 2 3 4 5
// 2 3 4 5 0