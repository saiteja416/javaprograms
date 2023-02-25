import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        for (int a = limit; a < 30; a += 5) {
            System.out.println(a);
        }
        System.out.println();
    }
}
