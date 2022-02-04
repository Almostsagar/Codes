public class d16 {
    public static void main(String[] args) {
        double s = 0;
        for (int i = 0; i < args.length; i++) {
            s = s + Double.parseDouble(args[i]);
        }
        System.out.println(s);
    }
}
