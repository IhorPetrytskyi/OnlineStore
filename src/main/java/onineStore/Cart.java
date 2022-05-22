package onineStore;

import onineStore.goods.Clothes;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Clothes, Integer> items = new HashMap<>();

    public void addToCart(Clothes clothes) {
        addToCart(clothes, 1);
    }

    public void addToCart(Clothes clothes, int count) {
        if (items.containsKey(clothes)) {
            items.put(clothes, items.get(clothes) + count);
        } else {
            items.put(clothes, count);
        }
    }

    private StringBuilder getModelName() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Clothes, Integer> map : items.entrySet()) {

            builder.append(map.getKey().getModel());
            builder.append("\t" + "\t");
            builder.append(items.get(map.getKey()));
            builder.append("\t" + "\t" + "\t" + "\t");
            builder.append(map.getKey().getPrice());
            builder.append("" + "\n");

        }
        return builder;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Clothes, Integer> entry : items.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public int getItemsCount() {
        int count = 0;
        for (Integer value : items.values()) {
            count += value;
        }
        return count;
    }

    public Map<Clothes, Integer> getCartItems() {
        return items;
    }

    @Override
    public String toString() {
        // TODO: implement this
        // "\n" - new line
        // "\t" - tabulation
        // ItemName item.count x item.price  item.price.total
        //....
        // Total: price of all items

        return "\t" + "\t" + "\t" + "\t" + "YOUR CART" + " \n" + "\n" +
                "model name:" + "\t" + "\t" + "quantity:" + "\t" + "\t" + "item price:" + "\n" + "\n" +
                getModelName() +
                "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "__________" + "\n" +
                "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + getTotalPrice() +
                "";
    }
}
