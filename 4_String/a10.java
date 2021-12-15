class a10{
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        System.out.println(str.matches(".*gmail.com.*"));
        int ind = str.indexOf("@");        
        ind = ind + 1;
        String domain = str.substring(ind);
        System.out.println("Domain name is : "+ domain);
        ind = ind - 1;
        String username = str.substring(0,ind);
        System.out.println("Username is : "+ username);
    }
}
    