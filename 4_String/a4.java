public class a4 {
    public static void main(String[] args) {
        String str = "Hello World \n";
        System.out.printf("%s", str);


        char data[] = { 'a', 'b', 'c' };
        String str2 = new String(data);
        System.out.printf("%s", str2);

        byte data2[] = { 65,66,67,68 };
        String str3 = new String(data2);
        System.out.printf("%s %n", str3);

        String str4 = new String("Java");
        System.out.println(str4);
        System.out.printf("%s", str4);
        System.out.print(str4);
        System.out.format("%s", str4);
    }
}