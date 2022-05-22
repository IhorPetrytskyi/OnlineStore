package onineStore.goods;

import onineStore.goods.characteristics.Size;

public abstract class Clothes {
    private int id;
    public String model;
    public Size size;
    public String color;
    public String type;
    public double price;


    public Clothes(int id, String model, Size size, String color, String type, double price) {
        this.id = id;
        this.model = model;
        this.size = size;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return " Clothing{ " +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                " , price " + price + '\'' +
                '}';
    }
}
