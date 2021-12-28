public class d2 {
    int max(int x, int y){
        if(x>y)
            return x;
         else
            return y;
        
    }
    public static void main(String[] args) {
        int a = 15, b = 10;
        d2 maxi = new d2();
        System.out.println(maxi.max(a,b));
    }
    
}
