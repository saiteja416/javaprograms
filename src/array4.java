public class array4 {
    public static void main(String[] args) {

        int[] d = {8, 9, 10, 1, 11, 22, 24, 25, 26, 28};
        int[] f = {7, 10, 25, 34, 45, 9, 41, 68, 34, 14};
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum = sum + d[i];
        }
        for (int j = 0; j < f.length; j++)
        {
            sum=sum+f[j];
        }
        System.out.println(sum);
    }
}