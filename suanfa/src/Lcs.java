import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lcs {

    public static int[][] LcsLength(char[] X, char[] Y) {

        int m = X.length;
        int n = Y.length;

        int[][] b = new int[X.length][Y.length];
        int[][] c = new int[X.length][Y.length];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (X[i] == Y[j]) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = 1;
                } else if (c[i - 1][j] >= c[i][j - 1]) {
                    c[i][j] = c[i - 1][j];
                    b[i][j] = 0;
                }else{
                    c[i][j] = c[i][j-1];
                    b[i][j] = -1;
                }

            }
        }
        b[0][0] = c[X.length-1][Y.length-1];

        return b;

    }

    public static void PrintLcs(int[][] b, char[] X, int i, int j){

        if(i == 0 || j == 0){
            return;
        }

        if(b[i][j] == 1){
            PrintLcs(b,X,i-1,j-1);
            System.out.print(X[i]);
        }else if(b[i][j] == 0){
            PrintLcs(b,X,i-1,j);
        }else{
            PrintLcs(b,X,i,j-1);
        }





    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = " " + bufferedReader.readLine();
        String b = " " + bufferedReader.readLine();

        char[] X = a.toCharArray();
        char[] Y = b.toCharArray();

        int[][] B = LcsLength(X,Y);

        PrintLcs(B,X,X.length-1,Y.length-1);

        System.out.println("\n长度为："+B[0][0]);

    }

}
