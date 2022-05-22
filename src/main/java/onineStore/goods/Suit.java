package onineStore.goods;

import onineStore.goods.characteristics.Material;
import onineStore.goods.characteristics.Size;

public class Suit extends Clothes {

    public Suit(int id, String model, Size size, String color, Material material, double price) {
        super(id, model, size, color, String.valueOf(material), price);
    }
}
