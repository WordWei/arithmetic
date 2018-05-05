import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Administrator on 2018/4/24.
 */
public class MaxSum {



    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");

        int max = Integer.MIN_VALUE;

        int[] a = new int[strings.length+1];
        int[] b = new int[strings.length+1];

        int start=1;
        int end=1;

        for(int i = 1;i<=strings.length;i++){
            a[i] = Integer.parseInt(strings[i-1]);
        }

        for(int i = 1;i<a.length;i++){
            b[i] = Math.max(b[i-1]+a[i],a[i]);
            if(max<b[i]){
                max = b[i];
                end = i;
            }
        }

        int sum=0;
        for(int i = end;i>0;i--){
            sum += a[i];
            if(sum == max){
                start = i;
            }
        }

        System.out.println("max:"+max+",start="+start+",end="+end);


    }
}
