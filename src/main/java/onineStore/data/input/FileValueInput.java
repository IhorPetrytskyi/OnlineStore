package onineStore.data.input;

public class FileValueInput implements ValueInput {

    private final String fileName;

    public FileValueInput(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String readValue(String key) {
        //READ FROM FILE
        return null;
    }

    @Override
    public String readCapitalizedValue(String key) {
        return null;
    }

    @Override
    public String readOptionalValue(String key) {
        return null;
    }



    @Override
    public int readIntegerValue(String key) {
        return 0;
    }
}
