public class a {
    public static void main(String[] args) {
        int[]a={10,11,12,13};
        int[]b={14,15,16,17};
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                sum=sum+a[i]+b[j];

            }

        }
        System.out.println(sum);

    }
}
