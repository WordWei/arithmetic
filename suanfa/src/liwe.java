import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Administrator on 2018/4/10.
 */
public class liwe {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] a = bufferedReader.readLine().split(" ");
        int[] A = new int[a.length];
        for(int i=0;i<a.length;i++){
            A[i] = Integer.parseInt(a[i]);

        }



        int x = Integer.parseInt(bufferedReader.readLine().split(" ")[0]);
        int k = Integer.parseInt(bufferedReader.readLine().split(" ")[1]);

        //Map<Integer, Integer>map = new HashMap<>();

        /*for(int i = 0;i<A.length;i++){
            int value;
            if(A[i]<x){
                value = x - A[i];
            }else if(A[i]>x){
                value = A[i] - x;
            }else{
                value = 0;
            }

            map.put(A[i],value);

        }*/
        int[] values = new int[A[A.length-1]];

        for(int i = 0;i<A.length;i++){
            int value;
             if(A[i]<x ){
                 value = x - A[i];

             }else if(A[i]>x){
                 value = A[i] - x;

             }else{
                 value = 0;
             }

             values[A[i]] = value;



        }

        Arrays.sort(values);
        int[] out = new int[k];
        for(int i=0;i<k;i++){



        }








    }
}
