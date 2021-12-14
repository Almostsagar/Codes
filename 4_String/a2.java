public class a2 {
    public static void main(String args[] ) {
        float flt = 5.58f;
        String cahr = "World";
        System.out.printf("Hello %s %f", cahr, flt);
        double dbl = 5.86d;
        System.out.printf("Double is : %f %n", dbl);



        char character = 'a';
        System.out.printf(" Character %c %% %n", character);


        int num = -10;
        System.out.printf("Number is : %d %n \n", num);
        System.out.printf("Octal is : %o %n", num);
        System.out.printf("Hexadecimal is : %x %n", num);

        float num2 = 5657.6f;
        System.out.printf("Normal Float is %f %n", num2);
        System.out.printf("Scientific float is %e \n", num2);

        System.out.printf("Format Specifiers ------------\n\n");


        System.out.printf("Format\tSpecifiers \n");
        System.out.printf("Format \t Specifiers\n");
        System.out.printf("Format\nSpecifiers0000\n");
        System.out.printf("Rita is going to market \rS\n");
        System.out.printf("Format\fSpecifiers\n");
        System.out.printf("Format \'Specifiers\'\n");
        System.out.printf("Format \"Specifiers\"\n");
        System.out.printf("Format \\Specifiers\\\n");


        System.out.printf("%n%n ------------ %n%n");
        int x = 5;
        float f = 5.87f;
        double d = 512.4d;
        System.out.printf("%1$d %3$f %2$f %n",x,d,f);
        System.out.printf("%1$d %3$f %3$f",x,d,f);

    }
}
