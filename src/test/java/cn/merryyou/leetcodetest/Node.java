package cn.merryyou.leetcodetest;

/**
 * Created on 2017/2/13 0013.
 *
 * @author zlf
 * @since 1.0
 */
public class Node {
    protected Node next;//指针域
    protected int data; //数据域

    public Node (int data){
        this.data=data;
    }

    /**
     * 显示此节点
     */
    public void display(){
        System.out.println("data:"+data);
    }

}
