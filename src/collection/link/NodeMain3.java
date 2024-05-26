package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A"); //x01
        first.next = new Node("B"); //x02
        first.next.next = new Node("C");    //x03

        //생성하고 연결한 node의 toString()
        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index의 노드 조회하기(특정 index에서 부터 조회하기)
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);
//        System.out.println("index2Node = " + index2Node.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);

    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;      // x01
        while (x.next != null) {    //x02, x03
//            System.out.println(x.next); //x02, x03
//            System.out.println(x.item); //A, B
            x = x.next;     // x02, x03
        }
//        System.out.println(x.item);
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;  //x01
        for (int i = 0; i <index; i++) {
            System.out.println(x.item);
            System.out.println(x.next);
            x = x.next; //i = 0, x02 / i = 1, x03
        }
        return x;
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);      //마지막 노드 찾기
        lastNode.next = new Node(param);
    }
}
