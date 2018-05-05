import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/4/15.
 */
public class suansan {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int q = Integer.parseInt(bufferedReader.readLine());

        int b[] = new int[q];

        for(int i = 0;i<q;i++){
            String[] s1 = bufferedReader.readLine().split(" ");


            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);

            int[][] arr = new int[n][m];

            int x = Integer.parseInt(s1[2])-1;
            int y = Integer.parseInt(s1[3])-1;



            int sum  = 0;

            for(int j = 0;j<s.length();j++){
                if(s.charAt(j) == 'u'){
                    x = x-1;
                    sum = sum+1;
                    if(x<0){
                        break;
                    }

                }
                if(s.charAt(j) == 'r'){
                    y=y+1;
                    sum = sum+1;
                    if(y==m){
                        break;
                    }

                }
                if(s.charAt(j) == 'd'){
                    x = x+1;
                    sum = sum+1;
                    if(x==n){
                        break;
                    }

                }
                if(s.charAt(j) == 'l'){
                    y = y-1;
                    sum = sum+1;
                    if(y<0){
                        break;
                    }

                }
            }

            b[i] = sum;


        }
        for (int a: b) {
            System.out.println(a);
        }


    }
}
