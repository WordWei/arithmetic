import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/25.
 */
public class ShortestPath {


    public static void Print(List<Node> list,int start, int end){
        if(end>0){
            Print(list,start,list.get(end).parent);
            System.out.println(list.get(end).parent+"-->"+list.get(end).number);
        }


    }




    public static void main(String[] args) {

        int m = 16;
        int[][] a = new int[m][m];

        a[0][1] = 5; a[0][2] = 3;
        a[1][3] = 1; a[1][4] = 3; a[1][5] = 6;
        a[2][4] = 8; a[2][5] = 7; a[2][6] = 6;
        a[3][7] = 6; a[3][8] = 8;
        a[4][7] = 3; a[4][8] = 5;
        a[5][8] = 3; a[5][9] = 3;
        a[6][8] = 8; a[6][9] = 4;
        a[7][10] = 2; a[7][11] = 2;
        a[8][11] = 1; a[8][12] = 2;
        a[9][11] = 3; a[9][12] = 3;
        a[10][13] = 3; a[10][14] = 5;
        a[11][13] = 5; a[11][14] = 2;
        a[12][13] = 6; a[12][14] = 6;
        a[13][15] = 4;
        a[14][15] = 3;


        List<Node> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (i == 0) {
                list.add(new Node(i,0));
            } else {
                list.add(new Node(i));
            }
        }

        int d = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != 0) {
                    d = list.get(i).value + a[i][j];
                    if (d < list.get(j).value) {
                        list.get(j).value = d;
                        list.get(j).parent = i;
                    }
                }
            }
        }

        Print(list,0,15);



    }
}
