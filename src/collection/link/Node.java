package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    //IDE 생성 toString()
//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }
//


    //직접 만든 toString
    //[A -> B -> C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;  //x01 , x02, x03
        sb.append("[");
        while (x != null) {
            sb.append(x.item);  //A , B , C
            if (x.next != null) {
                sb.append("->"); //A -> B ->
            }
            x = x.next; //x02 , x03
        }
        sb.append("]");
        return sb.toString();
    }
}
