public class a6 {
    public static void main(String[] args) {
        
        String str = new String("VSCode");
        System.out.println("Old String : "+ str);
        
        str = str.toLowerCase();
        System.out.println("LowerCase String : "+ str);
        
        str = str.toUpperCase();
        System.out.println("UpperCase String : "+ str);
        
        
        int len = str.length();
        System.out.println(len);
        
        
        String str2 = "    Welcome     ";
        System.out.println("Unformatted String : " + str2);
        
        String str3 = str2.trim();
        System.out.println("formatted String : " + str3);

        String str4 = str3.substring(3);
        String str5 = str3.substring(3, 5);

        System.out.println("Only Start index used : "+ str4);
        System.out.println("Start + end index used : "+ str5);
        
        System.out.println("Old String : "+ str);
        String str6 = str.replace('V', 'S');
        System.out.println("New String : "+ str6);
        char str7 = str.charAt(2);
        System.out.println("Character index at 2 is : "+ str7);

    }
}
