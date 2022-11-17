package stkey;

/**
 * Providing information about Samsung Brand and returning total Price
 * @author stkey
 * @version 0.0.1
 * @add Brand of Phone
 * @return phoneModel & totalPrice
 * @since 17.11.2022
 */
public class SamsungPhoneManager extends BasePhoneManager{
    SamsungPhoneManager(String phoneModel){
        //setting Samsung Brand
        setPhoneBrand("Samsung");
        super.phoneModel = phoneModel;
    }
    //method for calculating total price
    @Override
    public double buyTelephone(int price, double otv){
        double totalTax = ((price*0.18)+(price*0.10)+(price*0.01));
        double totalPrice;
        // Adding 250TL discount for person who buying Samsung Brand
        totalPrice = (price+(price*otv)+totalTax)-250;
        return totalPrice;
    }
}
