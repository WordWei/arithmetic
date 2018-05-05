import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.AlgorithmConstraints;
import java.util.Stack;

/**
 * Created by Administrator on 2018/4/9.
 */
public class Main1 {


    public static boolean panduan(char[]  A){
        int b = A.length-1;
        for(int i = 0;i<= A.length/2;i++){
            if(A[i] == A[b]){

            }else{
                return false;
            }
        }
        return true;

    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        char[] A = new char[a.length()];
        for(int i = 0;i<a.length();i++){
            A[i] = a.charAt(i);
        }


        panduan(A);




    }
}
