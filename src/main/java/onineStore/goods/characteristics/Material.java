package onineStore.goods.characteristics;

public enum Material {
    COTTON, POLYESTER;

    public String getStringValue() {
        String[] s = this.toString().split("_");
        StringBuilder sb = new StringBuilder();
        for (String word : s) {
            sb.append(capitalize(word)).append(" ");
        }
        return sb.toString().trim();
    }

    private String capitalize(String s) {
        return s.charAt(0) + s.substring(1).toLowerCase();
    }

}
