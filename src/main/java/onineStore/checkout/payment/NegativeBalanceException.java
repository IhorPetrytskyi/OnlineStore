package onineStore.checkout.payment;

public class NegativeBalanceException extends Exception {

    public NegativeBalanceException(String errorMessage) {
        super(errorMessage);
    }

}
