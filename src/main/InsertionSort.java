import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/5/5.
 */

/*
    插入排序：
        将一组数据分成两组，分别将其称为有序组与待插入组，
        每次从待插入组中取出一个元素，与有序组的元素进行比较，并找到合适的位置，将该元素插到有序组当中。
        就这样，每次插入一个元素，有序组增加，待插入组减少。直到待插入组元素个数为0。当然，插入过程中涉及到了元素的移动。
 */
public class InsertionSort {

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
