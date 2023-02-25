import java.util.Scanner;

public class problem {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a < 0 && a % 2 == 0)
        {
            System.out.println("Negative even number");
        }
        else {
            System.out.println("Negative odd number");

        }

           if (a > 0 && a % 2 == 0)
        {
            System.out.println("Positive even number");
        }
          else
        {
            System.out.println("Positive odd number");
        }
        if (a == 0)
            System.out.println("Zero");
    }
}

