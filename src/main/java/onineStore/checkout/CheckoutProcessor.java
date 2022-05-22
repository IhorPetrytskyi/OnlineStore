package onineStore.checkout;

import onineStore.Cart;
import onineStore.checkout.orders.OrderProcessor;
import onineStore.checkout.payment.CreditCard;
import onineStore.checkout.payment.NegativeBalanceException;
import onineStore.data.input.CreditCardDataInput;
import onineStore.data.input.DataInput;
import onineStore.data.input.UserDataInput;
import org.apache.commons.lang3.RandomStringUtils;

public class CheckoutProcessor {

    private DataInput<User> userDataInput = new UserDataInput();
    private DataInput<CreditCard> creditCardDataInput = new CreditCardDataInput();

    public String checkout(Cart cart) {

        return checkout(cart, userDataInput.getData(), creditCardDataInput.getData());
    }

    public String checkout(Cart cart, User user, CreditCard creditCard) {
        // make validation of user and credit card
//        if (creditCard.getNumber().length() != 16) {
//            throw new RuntimeException("Should contains 16 digits");
//        }

        int total = (int) (cart.getTotalPrice() - creditCard.getBalance());
        if (total < 0) {
            throw new RuntimeException("Not enough money on your balance");
        }
        // throw RuntimeException (proper naming) if anything wrong

        // Create order and add it to the queue
        OrderProcessor.Order order = new OrderProcessor.Order(RandomStringUtils.random(1000), cart.getCartItems());
        OrderProcessor.addOrder(order);

        return RandomStringUtils.random(7);

    }

}
