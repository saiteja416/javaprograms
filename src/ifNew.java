public class ifNew {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 1;
        if (a > b && b > a)
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}