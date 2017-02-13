package cn.merryyou.leetcodetest;

/**
 * LinkList 集合。。。
 * Created on 2017/2/10 0010.
 *
 * @author zlf
 * @since 1.0
 */
public class LinkListTest {
    public Node first; //定义一个头节点
    public int pos = 0; //节点位置

    public LinkListTest() {
        this.first = null;
    }

    public static void main(String[] args) {
        LinkListTest linkListTest = new LinkListTest();
        linkListTest.addFirstNode(10);
        linkListTest.addFirstNode(11);

        linkListTest.first.display();
        linkListTest.first.next.display();
    }

    /**
     * 插入一头个节点
     */
    public void addFirstNode(int data) {
        Node node = new Node(data);
        node.next = first;
        first = node;
    }

    /**
     * 删除一个头节点，并返回头节点
     */
    public Node deleteFirstNode() {
        Node tempNode = first;
        first = tempNode.next;
        return tempNode;
    }

    /**
     * 在任意位置插入节点，在index的后面插入
     *
     * @param index
     * @param data
     */
    public void add(int index, int data) {
        Node node = new Node(data);
        Node current = first;
        Node previous = first;
        while (pos != index) {
            previous = current;
            current = current.next;
            pos++;
        }
        node.next = current;
        previous.next = node;
        pos = 0;
    }

    /**
     * 删除任意位置的节点
     *
     * @param index
     * @return
     */
    public Node deleteByPos(int index) {
        Node current = first;
        Node previous = first;
        while (pos != index) {
            pos++;
            previous = current;
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else {
            pos = 0;
            previous.next = current.next;
        }
        return current;
    }

    /**
     * 显示出所有节点信息
     */
    public void displayAllNodes() {
        Node current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 根据位置查找节点信息
     *
     * @param index
     * @return
     */
    public Node findByPos(int index) {
        Node current = first;
        while (pos != index) {
            current = current.next;
            pos++;
        }
        return current;
    }

    /**
     * 根据数据查找节点信息
     *
     * @param data
     * @return
     */
    public Node findByData(int data) {
        Node current = first;
        while (current.data != data) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }
}
