public class Aee {
    public static void main(String[] args) {
        int a[]={10,-9,2,13,56,23,-90};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<max){
                max=a[i];
            }

        }
        System.out.println(max);

    }
}
