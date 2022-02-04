public class d14 {
    public static void main(String[] args) {
        System.out.println(max());;
        System.out.println(max(12));;
        System.out.println(max(12, 15));;
        System.out.println(max(12, 15,7821));;
    }

    static int max(int... n) {
        if (n.length == 0)
            return Integer.MIN_VALUE;
        int m = n[0];
        for (int i = 1; i < n.length; i++)
            if (n[i] > m)
                m = n[i];
        return m;
    }
}
