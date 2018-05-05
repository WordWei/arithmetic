import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/4/25.
 */
public class Lcs2 {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        if (a.length == 0 || b.length == 0) {
            System.out.println("a或b其中一个为空串！");
        }

        int maxlength = 0;
        int flag = 0;

        int[][] results = new int[b.length+1][a.length+1];

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if(b[i]==a[j]){
                    results[i+1][j+1] = results[i][j]+1;
                    if(maxlength<results[i+1][j+1]){
                        maxlength = results[i+1][j+1];
                        flag = i+1;
                    }
                }else{
                    results[i+1][j+1] = 0;
                }
            }
        }


        System.out.println("最长公共子串长度为："+maxlength);
        System.out.println("最长公共子串为："+s2.substring(flag-maxlength,flag));




    }
}
