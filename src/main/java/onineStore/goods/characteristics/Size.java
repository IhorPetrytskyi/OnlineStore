package onineStore.goods.characteristics;

public enum Size {

    EXTRA_SMALL("XS"), SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL"), EXTRA_EXTRA_LARGE("XXL");

    public final String stringValue;

    Size(String stringValue) {
        this.stringValue = stringValue;
    }

}
