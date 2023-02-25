import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(br.readLine());
        Float.parseFloat(br.readLine());
        String s = br.readLine();
        System.out.println(a);
        System.out.println(s);


    }
}
