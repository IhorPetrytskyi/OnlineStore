package onineStore.data.input;

import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleValueInput implements ValueInput {

    private final Scanner input;

    public ConsoleValueInput(InputStream inputStream) {
        this.input = new Scanner(inputStream);
    }

    @Override
    public String readValue(String key) {
        String result = null;
        while (StringUtils.isEmpty(result) ) {
            result = readOptionalValue(key);
        }
        return result;
    }

    @Override
    public String readCapitalizedValue(String key) {
        return StringUtils.capitalize(readValue(key));
    }

    @Override
    public String readOptionalValue(String key) {
        System.out.println(key);
        return input.nextLine();
    }


    @Override
    public int readIntegerValue(String key) {
        System.out.println(key);
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number");
            input.nextLine();
        }
        int number = input.nextInt();
    return number;
    }
}
