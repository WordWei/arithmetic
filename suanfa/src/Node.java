/**
 * Created by Administrator on 2018/4/25.
 */
public class Node {

    public int number;

    public int value = Integer.MAX_VALUE;

    public int parent;

    Node(int number,int value){
        this.number = number;
        this.value = value;
    }

    Node(int number){
        this.number = number;
    }

}
