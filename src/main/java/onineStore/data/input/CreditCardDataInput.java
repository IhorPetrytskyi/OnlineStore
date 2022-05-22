package onineStore.data.input;

import onineStore.checkout.Address;
import onineStore.checkout.User;
import onineStore.checkout.payment.CreditCard;

public class CreditCardDataInput implements DataInput<CreditCard> {
    private final ValueInput valueInput;

    public CreditCardDataInput() {
        this.valueInput = new ConsoleValueInput(System.in);
    }


    @Override
    public CreditCard getData() {
        CreditCard creditCard = new CreditCard();
        creditCard.setUserName(valueInput.readCapitalizedValue("Enter USER NAME"));
        creditCard.setNumber(valueInput.readIntegerValue("Enter CARD NUMBER"));
        creditCard.setCvv(valueInput.readIntegerValue("Enter CVV NUMBER"));
        creditCard.setMonth(valueInput.readIntegerValue("Enter MONTH"));
        creditCard.setYear(valueInput.readIntegerValue("Enter YEAR"));
        creditCard.setBillingAddress(new AddressDataInput().getData());

        return creditCard;
    }
}
