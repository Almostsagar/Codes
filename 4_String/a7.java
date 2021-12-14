public class a7 {
    public static void main(String[] args) {
        String actorName = "Mr. Sharks khan";
        System.out.println("Original Text : " + actorName);
        System.out.println(actorName.startsWith("M"));
        System.out.println(actorName.startsWith("M", 1));
        // (starts with, index number)
        System.out.println(actorName.endsWith("n"));

        for (int i = 0; i < actorName.length(); i++) {
            System.out.print(actorName.charAt(i));
        }
        System.out.println("\n");
        String new_Str = "www.udemy.co.in";
        System.out.println(new_Str.indexOf('.'));
        System.out.println(new_Str.indexOf('.', 4));
        // after 4th index where dot(.) is appearing
        System.out.println(new_Str.lastIndexOf(' '));
        System.out.println(new_Str.charAt(5));
        System.out.println(new_Str.lastIndexOf('.',10));
    }
}
