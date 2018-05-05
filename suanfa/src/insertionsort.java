import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * Created by Administrator on 2018/4/8.
 */
public class insertionsort {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] a = bufferedReader.readLine().split(" ");
        int[] A = new int[a.length];
        for(int i=0;i<a.length;i++){
            A[i] = Integer.parseInt(a[i]);

        }

        int i = 0;
        int key = 0;
        for(int j = 1;j<A.length;j++){
            key = A[j];
            i = j-1;
            while(i>=0 && A[i] > key){
                A[i+1] = A[i];
                i = i-1;
            }
            A[i+1] = key;
        }

        for (int k:A) {
            System.out.print(k+" ");
        }



    }
}
