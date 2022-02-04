public class assignment {
    public static void main(String[] args) {


        // Reverse a String and print it on console
        // "Java Skills" .
        String str = "Java Skills" ;
        for (int index = str.length()-1; index >= 0; index--) {
                System.out.print(str.charAt(index));
        }

        // Assign String to x variable in DD-MM-YYYY format
        // extract and print Year from String. 
        String str2 = "10-01-2021";
        int index = str2.lastIndexOf("-");
        System.out.println(str2.substring(index+1));


        // In a small company, the average salary of three employees is Rs1000 per week.
        //  If one employee earns Rs1100 and other earns Rs500, how much will the third
        //  employee earn? Solve by using java programm
        int avg = 1000;
        int e1 = 1100;
        int e2 = 500;
        int e3 = (avg*3)-e1-e2;
        System.out.println(e3);



      // Write Program - A train 340 m long is running at a speed of 45 km/hr. 
    //   what time will it take to cross a 160 m long tunnel?
    int trainLen = 340;
    int tunnelLen = 160;
    int sum  = trainLen+tunnelLen;
    int speed = 45;
    double speedOfTheTrain = (double)speed * (5/18);
    double timetaken = sum/speedOfTheTrain;
        System.out.println(timetaken);
    }
}
