import java.util.Arrays;

public class ana {
    public void d(){
        String x="rams";
        String y="mars";
        char [] a=x.toCharArray();
        char []b=y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result=Arrays.equals(a,b);
        if (result==true){
            System.out.println("String are Anagram");
        }
     else {
            System.out.println("strings are not Anagram");
        }

    }
}
