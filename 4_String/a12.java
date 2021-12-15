public class a12 {
    public static void main(String[] args) {
        
        String iString = "a$b%i^3*A";
        String oString = iString.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(oString);
        // remove all special characters

        String iString2 = "a$b% i^3 *A";
        System.out.println(iString2.replaceAll("[\\s+]", ""));
        // System.out.println(iString2.replaceAll("[\\s]","").trim());
        // remove all spaces 

        String iString3 = "   hello   world    ";
        String oString3 = iString3.replaceAll("[\\s+]", " ").trim();
        String words[] = oString3.split("\\s"); 
        System.out.println(words.length);
        // Find no of words in a string 

    }
}
