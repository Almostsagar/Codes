import java.util.Scanner;

public class d8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        int arr[] = {1,2,3,2,8};
        int max = maxOfArray(arr);
       System.out.println(max);;
        sc.close();
    }

    static int maxOfArray(int arr[]){
        int maxx=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxx) {
                maxx = arr[i];
            }
        }
        return maxx;
    }
}
