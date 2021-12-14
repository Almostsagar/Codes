public class a3 {
    public static void main(String[] args) {
        // Width
        int d = 55;
        System.out.printf("%5d \n", d);
        // Flag
        // '0'
        int d1 = 55;
        System.out.printf("%05d\n", d1);
        // '('
        int d2 = -55;
        System.out.printf("%(5d\n", d2);
        // '('
        int d3 = 55;
        System.out.printf("%(5d\n", d3);
        // '+'
        int d4 = -55;
        System.out.printf("%+5d\n", d4);
        // '+'
        int d5 = 55;
        System.out.printf("%+5d\n", d5);
        // '-'
        int d6 = -55;
        System.out.printf("%-5d\n", d6);
        // '-'
        int d7 = 55;
        System.out.printf("%-5d\n", d7);

        System.out.printf("\n --------- \n");

        float fl = 66.54435f;
        System.out.printf("%08.2f %n", fl);

        String chh = "Java";
        System.out.printf("%-10s", chh);
    }
}
