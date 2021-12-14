public class a5 {
    public static void main(String[] args) {

        // Video no 46
        String str1 = "Java Program";
        String str2 = new String("Java Program");
        System.out.println(str1 + "\n" + str2 );

        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c);
        System.out.println(str3);

        byte b[] = {65,66,67,68,69};
        String str4 = new String(b);
        System.out.println(str4);

        byte b2[] = {65,66,67,68,69};
        String str5 = new String(b2, 0, 5);   // (array name, start index, no of elements)
        System.out.println(str5);

        char c2[] = {'H','e','l','l','o'};
        String str6 = new String(c2,0,4);    // (array name, start index, no of elements)
        System.out.println(str6);

        String stra = "Java";
        String strb = "Java";
        System.out.println(stra == strb);
        
        String strd = "Java";
        String stre = "java"; 
        System.out.println(strd == stre);

        String strc = new String("Java");
        System.out.println(stra == strc);



    }
}
