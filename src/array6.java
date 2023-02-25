public class array6 {
    public static void main(String[] args) {
        int[] a = {23, 26, 28, 29, 87};
        int[] b = {25, 12, 56, 45,89};
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] + b[i];
                b[i] = a[i] - b[i];
                a[i] = a[i] - b[i];
            }
        }
            else
            {
                System.out.println("length should be same");
            }
            System.out.println("a--data type");
            for (int t1:a)
            {
                System.out.println(t1);
            }
        System.out.println("b--data type");
            for(int t2:b)
            {

                System.out.println(t2);
            }

        }
    }