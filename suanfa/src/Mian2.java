import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/9.
 */
public class Mian2 {

    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String a = bufferedReader.readLine();
            list.add(a);
        }

        int l=0;
        int r=0;
        for(int i = 0;i<list.size();i++){
            String s = list.get(i);
            for(int j = 0,k=0;j<s.length();j++){

                if(s.charAt(j) == '('){
                    l++;
                }
                if(s.charAt(j) == ')'){
                    r++;
                }

            }
            if(l!=r){
                System.out.println("No");
            }else{
                if(l%2==1 || r%2==1){
                    System.out.println("Yes");
                }
            }
        }




    }
}
