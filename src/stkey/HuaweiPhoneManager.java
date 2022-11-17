package stkey;

/**
 * Providing information about Huawei Brand and returning total Price
 * @author stkey
 * @version 0.0.1
 * @add Brand of Phone
 * @return phoneModel & totalPrice
 * @since 17.11.2022
 */
public class HuaweiPhoneManager extends BasePhoneManager{
    HuaweiPhoneManager(String phoneModel){
        setPhoneBrand("Huawei");
        super.phoneModel = phoneModel;
    }
    //method for calculating total price
    @Override
    public double buyTelephone(int price, double otv){
        double totalTax = ((price*0.18)+(price*0.10)+(price*0.01));
        double totalPrice;
        // Adding %25 discount for person who buying Huawei Brand
        totalPrice = (price+(price*otv)+totalTax-(price*0.25));
        return totalPrice;
    }
}
