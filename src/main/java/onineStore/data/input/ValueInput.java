package onineStore.data.input;

public interface ValueInput <T>{

    String readValue(String key);

    String readCapitalizedValue(String key);

    String readOptionalValue(String key);

    int readIntegerValue(String key);
}
