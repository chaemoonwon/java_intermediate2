package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int total = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
//            System.out.println(numbers.get(i));
        }
        double average = (double) total / numbers.size();
        System.out.print("입력한 정수의 합계: " + total + "\n");
        System.out.print("입력한 정수의 평균: " + average);
    }
}
