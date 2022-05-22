package onineStore.data.input;

import onineStore.checkout.Address;

public class AddressDataInput implements DataInput<Address> {

    private final ValueInput valueInput;

    public AddressDataInput() {
        this.valueInput = new ConsoleValueInput(System.in);
    }


    @Override
    public Address getData() {
        Address address = new Address();

        address.setCountry(valueInput.readCapitalizedValue("Enter your country"));
        address.setCity(valueInput.readOptionalValue("Enter your city"));
        address.setStreet(valueInput.readCapitalizedValue("Enter your street"));
        address.setZipCode(valueInput.readIntegerValue("Enter your zip code"));

        return address;
    }
}
