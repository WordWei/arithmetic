import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Administrator on 2018/4/23.
 */
public class JuZhenLian {

    //n代表矩阵链长度
    public static void MaxTrixChainOrder(int[] P, int N, int[][] M, int[][] S) {

        for (int i = 1; i <= N; i++) {
            M[i][i] = 0;
        }

        //链长度
        for (int l = 2; l <= N; l++) {

            for (int i = 1; i <= N - l + 1; i++) {
                int j = l + i - 1;

                M[i][j] = M[i][i] + M[i + 1][j] + P[i - 1] * P[i] * P[j];
                S[i][j] = i;

                for (int k = i + 1; k < j; k++) {
                    int temp = M[i][k] + M[k + 1][j] + P[i - 1] * P[k] * P[j];
                    if (temp<M[i][j]) {
                        M[i][j] = temp;
                        S[i][j] = k;
                    }
                }


            }
        }


    }

    public static void Print(int[][] S, int i,int j){
        if(i == j){
            System.out.print("A"+i);
        }else{
            System.out.print("(");
            Print(S,i,S[i][j]);
            Print(S,S[i][j]+1,j);
            System.out.print(")");
        }

    }


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = bufferedReader.readLine().split(" ");

        int[] P = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            P[i] = Integer.parseInt(strings[i]);
        }


        int N = P.length-1;
        int[][] M = new int[P.length][P.length];
        int[][] S = new int[P.length][P.length];

        MaxTrixChainOrder(P,N,M,S);

        Print(S,1,N);
        System.out.println("\n");
        System.out.println("总共计算"+M[1][N]+"次！");
    }
}
