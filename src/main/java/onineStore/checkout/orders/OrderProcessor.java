package onineStore.checkout.orders;

import onineStore.goods.Clothes;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class OrderProcessor {

    private static Queue<Order> orders = new LinkedList<>();

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static class Order {
        private final String confirmationNumber;
        private final Map<Clothes, Integer> items;

        public Order(String confirmationNumber, Map<Clothes, Integer> items) {
            this.confirmationNumber = confirmationNumber;
            this.items = items;
        }
    }
}
