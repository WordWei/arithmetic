import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/4/15.
 */
public class suanfasi {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] sum = new int[n];

        for(int i=0;i<n;i++){

            String[] s1 = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(s1[0]);
            int b = Integer.parseInt(s1[1]);
            int c = Integer.parseInt(s1[2]);

            if(c>b){
                sum[i] = 0;
            }else if(a==c){
                sum[i] = 1;
            }else if(b==c){
                sum[i] = 1;
            }else if(c<a){
                sum[i] = 4;

            }else if(a<c&&c<b){
                sum[i] = 0;
            }











        }


        for (int a: sum) {
            System.out.println(a);
        }

    }
}
