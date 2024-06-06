package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {

    ArrayList<Item> cart = new ArrayList<>();
//    int totalPrice = 0;

    public void addItem(Item item) {
        cart.add(item);
//        int totalPrice = 0;
//
//        for (int i = 0; i < cart.size(); i++) {
//            item = cart.get(i);
//            String name = item.getName();
//            totalPrice += item.getTotalPrice();
//        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (Item item : cart) {
            String name = item.getName();
            //각각의 상품에 대한 상품 명과 합계
            System.out.println("상품명:" + name + ", 합계:" + item.getTotalPrice());
//            totalPrice += item.getTotalPrice();
        }

        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    // 전체 가격 합
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : cart) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }


}
