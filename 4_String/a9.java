public class a9 {
    public static void main(String[] args) {
        // Matching Symbols

        String str1 = "[";
        System.out.println(str1.matches("."));  
        // exactly any one character

        String str2 = "a";
        System.out.println(str2.matches("[abc]"));
        // Exactly one of the given characters

        String str3 = "ay";
        System.out.println(str3.matches("[abc][xy]"));
        // one character from one sq box and other from other sq box
        // Either from first or 2nd set

        String str4 = "f";
        System.out.println(str4.matches("[^abc]"));
        // except these given words

        String str5 = "A";
        System.out.println(str5.matches("[a-v  A - Z 1-7]"));
        // character from given range only

        String str6 = "A";
        System.out.println(str6.matches("[A | B]"));
        // one character or other

        String str7 = "b";
        System.out.println(str7.matches("[Ab]"));
        // exactly these given words




        System.out.println("-------------");  

        // Meta Characters
        
        String str8 = "1";
        System.out.println(str8.matches("\\d"));  
        // Only a single digit

        String str9 = "a";
        System.out.println(str9.matches("\\D"));
        // Anything(one character) other than digits

        String str10 = " ";
        System.out.println(str10.matches("\\s"));
        // only one space

        String str11 = "g";
        System.out.println(str11.matches("\\S"));
        // one character and no space

        String str12 = "h";
        System.out.println(str12.matches("\\w"));
        // one Alphabet or digit

        String str13 = "$";
        System.out.println(str13.matches("\\W"));
        // any one character (Neither Alphabet nor digit)




        System.out.println("-------------");  


        // Quantifiers - This is used with matching symbols

        String str14 = "hello, v56";
        System.out.println(str14.matches(".*"));
        // matching pattern 0 or more times

        String str14_1 = "AA";
        System.out.println(str14_1.matches("[A - Z]*"));
        // matching pattern 0 or more times

        String str15 = "bcAbcc";
        System.out.println(str15.matches("[Abc]+"));
        //  matching pattern 1 or more times

        String str16 = "AAAAAAAAbb";
        System.out.println(str16.matches("[Ab]{10}"));
        // {X} times the matching pattern
        
        String str17 = "AAb";
        System.out.println(str17.matches("[Ab]{3,5}"));
        // Between {X} and {Y} times the matching pattern
        
 
        System.out.println("-------------"); 
        String email = "sagar19003@gmail.com"; 
        System.out.println(email.matches(".*gmail.*"));
        System.out.println(email.matches("\\w*@gmail.*"));

    }
}
