package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/5/5.
 */

/*
    快速排序：
        选取一个枢纽元进行一趟快排，将比起小的元素放在左边，
        比其大的元素放在右边，然后递归的对左右两部分分别进行快速排序即可。
        具体分为两个过程：实现quicksort函数与partition函数，
            quicksort：将选中数据放入正当位置，并递归的调用quicksort。
            partition：按规则将选中数据放入最终排序的位置，并返回索引。
 */

public class QuickSort {

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
