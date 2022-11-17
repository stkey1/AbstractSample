package stkey;

/**
 * Providing information about Apple Brand and returning total Price
 * @author stkey
 * @version 0.0.1
 * @add Brand of Phone
 * @return phoneModel & totalPrice
 * @since 17.11.2022
 */
public class ApplePhoneManager extends BasePhoneManager{
    ApplePhoneManager(String phoneModel){
        setPhoneBrand("Apple");
        super.phoneModel = phoneModel;
    }
    //method for calculating total price
    @Override
    public double buyTelephone(int price, double otv){
        double totalTax = ((price*0.18)+(price*0.10)+(price*0.01));
        double totalPrice;
        // Adding %20 extra price for person who buying İphone Brand
        totalPrice = (price+(price*otv)+totalTax+(price*0.20));
        return totalPrice;
    }
}