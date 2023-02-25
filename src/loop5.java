public class loop5 {
    public static void main(String[] args) {
        int a = 1;
        int evenSum=0;
        while (a <= 20)
        {
            if(a%2==0)
            {
                evenSum=evenSum+a;
            }

            a++;
        }
        System.out.println(evenSum);
    }
}