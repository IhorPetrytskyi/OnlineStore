package onineStore.checkout.payment;

import java.time.LocalDate;

public class PaymentProcessor {

    public boolean chargeCard(CreditCard creditCard, double amount) {
        if (creditCard.getBillingAddress() == null) {
            return false;
        }
        if (creditCard.getYear() < LocalDate.now().getYear()) {
            return false;
        }
        if (creditCard.getYear() == LocalDate.now().getYear() && creditCard.getMonth() < LocalDate.now().getMonthValue()) {
            return false;
        }
        try {
            creditCard.withdraw(amount);
        } catch (NegativeBalanceException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }
}
