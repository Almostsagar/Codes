public class a10 {
    public static void main(String[] args) {
        String wSite = "ftp://www.google.net";
        int firstHand = wSite.indexOf(":");
        if (wSite.substring(0, firstHand) == "https") {
            System.out.println("HTTPS");
        } else {
            System.out.println("FTP");
        }
        int lastHand = wSite.lastIndexOf(".");
        String str = wSite.substring(lastHand + 1, wSite.length());
        if (str.equals("com")) {
            System.out.println("com - Commercial");
        } else if (str.equals("net")) {
            System.out.println("net - Network");
        } else if (str.equals("biz")) {
            System.out.println("biz - Business");
        } else if (str.equals("org")) {
            System.out.println("org - Organization");
        } else {
            System.out.println("Error");
        }
    }
}
