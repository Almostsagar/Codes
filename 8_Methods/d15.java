public class d15 {
    public static void main(String[] args) {
        sumAll();
        sumAll(1,2);
        sumAll(66,57,587);
    }
    static void sumAll(int ...nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}
