import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in the array : ");
        int ele = sc.nextInt();
        int arr[] = new int[ele];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you wanna find");
        int key = sc.nextInt();  // approach - 1
                                // int num = 0;
                                // System.out.println("The elements of the array are : ");
                                // for (int i : arr) {
                                //     System.out.print(i + " ");
                                //     if(i == key){                
                                //         num++;
                                //     }
                                // }
                                // System.out.println();
                                // if (num == 1) {
                                //     System.out.println("Element is found : "+ num);
                                // } else{
                                //     System.out.println("The element couldn\'t be found");
                                // }
        // approach - 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element is found at index : " + i);
                System.exit(0);
            }
        }                      
        System.out.println("Not Found");  
        sc.close();
    }
}
