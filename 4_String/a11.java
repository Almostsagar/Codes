public class a11 {
    public static void main(String[] args) {
        String test = "100101010";
        System.out.println(test.matches("[0-1]*"));
        // only boolean values

        String test2 = "af56";
        System.out.println(test2.matches("[0-9 A-F]+"));
        // only hexadecimal values

        String test3 = "31/12/2651";
        int indexofslash = test3.indexOf('/');
        String date = test3.substring(0, indexofslash);
        int date_int = Integer.parseInt(date); 
        String month = test3.substring(indexofslash + 1, test3.lastIndexOf("/"));
        int month_int = Integer.parseInt(month);  

        if (date_int <= 31 && month_int <= 12) {
            System.out.println(test3.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
       } else {
           System.out.println("Date Format not correct");
       }
        // date format dd/mm/yyyy   

        
    }
}
