import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Administrator on 2018/4/9.
 */

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        char[] A = new char[a.length()];
        for(int i = 0;i<a.length();i++){
            A[i] = a.charAt(i);
        }
        int num = 0;
        for(int i = 0;i<A.length;i++){
            if(i == 0){
                if(A[i]!=A[i+1]){
                    num++;
                }
            }else if(i == A.length-1){
                if(A[i]!=A[i-1]){
                    num++;
                }
            }else{

                if(A[i]!=A[i-1] || A[i]!=A[i+1]){
                    num++;
                }
            }

        }

        System.out.println(num);

    }

}
