package collection.map.test.cart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int count) {
        if (cartMap.equals(product)) {
            cartMap.put(product, count);
        }

        Set<Product> products = cartMap.keySet();
        for (Product product1 : products) {
            Integer integer = cartMap.get(product1);
            if (product.equals(product1)) {
                cartMap.put(product1, integer + count);
            }
        }

//
//        Set<Map.Entry<Product, Integer>> entries = cartMap.entrySet();
//        for (Map.Entry<Product, Integer> entry : entries) {
//
//            if (count != 0) {
//                Product key = entry.getKey();
//                Integer value = entry.getValue();
//                if (key.equals(product)) {
//                    value++;
//                }
//                cartMap.put(key, value);
//            }
//        }
//        Set<Product> products = cartMap.keySet();
//        for (Product product1 : products) {
//            cartMap.put(product1, count);
//            cartMap.get(product);
//        }
//        Integer preCount = cartMap.get(product);
//        if (product.equals(cartMap)) {
//            preCount += count;
//            cartMap.put(product, preCount);
//        }
    }

    public void minus(Product product, int minus) {
        int preCount = cartMap.get(product) - minus;
        if (preCount <= 0) {
            cartMap.remove(product);
        }
//        Set<Product> products = cartMap.keySet();
//        System.out.println(products);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("상품: " + key + " 수량: " + value);
        }
    }
}
