package collage;

public  abstract class Automobiles {
    private String model;
    private int year;
public abstract void run();

    @Override
    public String toString() {
        return "Automobiles{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

