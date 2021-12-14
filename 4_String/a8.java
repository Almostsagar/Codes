public class a8 {
    public static void main(String[] args) {

        String str1 = "JAVA";
        String str2 = "java";
        String str3 = "python";
        String str4 = "python";
        System.out.println(str3.equals(str4));
        System.out.println(str4.equals(str3));
        System.out.println(str2.equals(str1));
        System.out.println(str2.equalsIgnoreCase(str1));
        System.out.println(str2.compareTo(str1));
        System.out.println(str3.compareTo(str4));
        System.out.println(str2.compareTo(str3));


        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));
        if (s2 == s1) {
            System.out.println("omk");
        } else {
            System.out.println("kk");
        }

        if (s3 == s1) {
            System.out.println("omk");
        } else {
            System.out.println("kk");
        }


        String st1 = "The Great Wall Of China";
        System.out.println(st1.contains("Wall"));

        String st2 = "The Great Wall"; 
        String st3 = " Of China";
        System.out.println(st2.concat(st3));
        System.out.println(st2 + st3);

        

    }
}
