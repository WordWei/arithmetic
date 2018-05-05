import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/4/8.
 */
public class quicksort {

    public static void quicksort(int[] A,int p,int r){
        if(p>=r){
            return;
        }
        int q = partition(A,p,r);
        quicksort(A,p,q-1);
        quicksort(A,q+1,r);
    }

    public static int partition(int[] A,int p,int r){
        int key =  A[r];
        int i = p-1;
        for(int j = p;j<r;j++){
            if(A[j]<=key){
                i = i+1;
                int temp;
                temp = A[i];A[i]=A[j];A[j]=temp;
            }
        }
        int temp;
        temp = A[i+1];A[i+1] = A[r];A[r] = temp;
        return i+1;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] a = bufferedReader.readLine().split(" ");
        int[] A = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            A[i] = Integer.parseInt(a[i]);
        }
        quicksort(A,0,A.length-1);

        System.out.println(Arrays.toString(A));




    }
}
