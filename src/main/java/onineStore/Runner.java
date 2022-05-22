package onineStore;

import onineStore.checkout.Address;
import onineStore.checkout.CheckoutProcessor;
import onineStore.checkout.User;
import onineStore.checkout.UsersWithDiscount;
import onineStore.checkout.payment.CreditCard;
import onineStore.goods.characteristics.Size;
import onineStore.goods.Suit;
import onineStore.goods.characteristics.Material;

public class Runner {
    public static void main(String[] args) {
       User user = new User("Ihor", "Petrytskyi");
        Suit suit1 = new Suit(0,"Hugo Boss", Size.LARGE, "Blue", Material.POLYESTER ,600);
        Suit suit2 = new Suit(0,"Hugo Boss", Size.EXTRA_LARGE, "Blue", Material.COTTON ,1000);
        Cart cart = new Cart();
        cart.addToCart(suit1);
        cart.addToCart(suit2, 13);
        System.out.println(suit1.size.stringValue);
          System.out.println(cart);

          CheckoutProcessor processor1 = new CheckoutProcessor();

          CreditCard creditCard = new CreditCard();
          creditCard.addBalance(2000);

          //processor1.checkout(cart);
          processor1.checkout(cart,user,creditCard);


    }

    //new Checkout (cart);
    // checkout.addPerson();
    //....
    // String confirmationNumber = checkout.proceedCheckout();
}
