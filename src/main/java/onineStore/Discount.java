package onineStore;

import onineStore.checkout.UsersWithDiscount;

public class Discount   {
    Cart cart = new Cart();
    public double discountFormula (UsersWithDiscount usersWithDiscount){
        double discountFormula = 0;
        discountFormula = cart.getTotalPrice() /2;
        System.out.println(discountFormula);
        return discountFormula;
    }
}
