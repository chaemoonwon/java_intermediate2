package collection.link;

public class MyLinkedListV3<E> {
    private Node<E> first;     //첫 노드의 위치
    private int size = 0;   //자료 구조에 입력된 데이터의 사이즈

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    //추가 코드
    // 데이터 추가
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            //첫 번째 데이터 추가
            newNode.next = first;   //기존 first -> newNode.next
            first = newNode;    //newNode -> first
        } else {
            Node<E> prev = getNode(index - 1); //직전 노드 찾기
            newNode.next = prev.next;   //직전 노드의 다음 노드의 참조값을 신규 노드의 참조값에 대입
            prev.next = newNode;    //신규 노드를 진전 노드의 다음 노드가 참조할 수 있도록 참조값을 대입
        }
        size++;
    }


    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    //추가 코드
    //데이터 삭제
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if (index == 0) {
            //첫 번째 데이터 삭제
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }

        //삭제 된 노드의 데이터를 null값으로 초기화
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
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
            Node<E> x = this;  //x01 , x02, x03
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

}
