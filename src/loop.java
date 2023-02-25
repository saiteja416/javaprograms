public class loop {
    public static void main(String[] args) {
        int r= 89;
        int c=68;
        r--;//89
       int sum1 = r-- + --r +r--+ ++c+ --r;
       //sum1=    88-1+87-1=86+86-1+68+1=69+84=

       System.out.println(sum1);
       int sum2 = sum1 + c-- + r++;
        System.out.println(sum2);
        System.out.println(" ");
        System.out.println(sum1 + sum2);
       System.out.println(r);


    }
}
