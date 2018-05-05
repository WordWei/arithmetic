import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/5/5.
 */

/*
 归并排序：
    算法思想为分治法，本次实现是递归实现。
    依次将一个大的排序序列通过二分法分成两个部分，然后将两个排好序的序列做归并操作，完成总的排序。
    在小的任务中重复实现上述操作，直到序列数量为1，然后统一归并实现排序。
 */
public class MergeSort {
    public static void mrege_sort(int[] A, int p, int r) {

        int q = (p + r) / 2;

        if (p < r) {

            mrege_sort(A, p, q);
            mrege_sort(A, q + 1, r);
            //对归并时做出优化
            if (A[q] > A[q + 1]) {
                merge(A, p, q, r);
            }

        }
    }

    public static void merge(int[] X, int p, int q, int r) {

        //定义临时数组
        int[] Y = new int[r - p + 1];
        int i = p;
        int j = q + 1;
        int k = 0;

        while (i <= q && j <= r) {
            if (X[i] <= X[j]) {
                Y[k++] = X[i++];
            } else {
                Y[k++] = X[j++];
            }

        }

        while (i <= q) {
            Y[k++] = X[i++];
        }

        while (j <= r) {
            Y[k++] = X[j++];
        }

        for (int s = 0; s < Y.length; s++) {
            X[s + p] = Y[s];
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] a = bufferedReader.readLine().split(" ");
        int[] A = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            A[i] = Integer.parseInt(a[i]);
        }

        mrege_sort(A, 0, A.length - 1);

        for (int value : A) {
            System.out.print(value + " ");
        }
    }
}
