public class d11 {
    public static void main(String[] args) {
        System.out.println(area(5.6, 3.6));
        System.out.println(area(16));
    }
    static double area(double radius){
        return Math.PI*radius*radius;
    }    
    static double area(double l,double b){
        return l*b;
    }
}
