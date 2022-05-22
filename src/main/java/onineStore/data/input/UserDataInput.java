package onineStore.data.input;

import onineStore.checkout.Address;
import onineStore.checkout.User;

import java.time.LocalDate;

public class UserDataInput implements DataInput<User> {

    private final ValueInput valueInput;

    public UserDataInput() {
        this.valueInput = new ConsoleValueInput(System.in);
    }

    @Override
    public User getData() {

        String firstName = valueInput.readCapitalizedValue("Enter your FIRST NAME ");
        String lastName = valueInput.readCapitalizedValue("Enter your LAST NAME ");
        String email  = valueInput.readOptionalValue("Enter your EMAIL");
        int LocalDate  = valueInput.readIntegerValue("Enter your BIRTHDAY DATE");
//        String  address = valueInput.readOptionalValue("Enter your ADDRESS");



        User user = new User(firstName, lastName);
        user.setAddress(new AddressDataInput().getData());

        return user;
    }
}
