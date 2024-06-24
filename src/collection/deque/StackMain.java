package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //입력
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        //다음 꺼낼 요소 확인(꺼내지 않고 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        //스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);

        //정리
        //Stack은 후입선출로써 가장 먼저 입력한 데이터를 가장 나중에 꺼냄.
        //stack은 자바 vector의 자료구조를 이용함.
        //지금은 사용되지 않고 하위호환을 위해서 존재
        //그러므로 사용하지 않는 것을 권장함.
    }
}
