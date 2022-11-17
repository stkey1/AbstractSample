package stkey;

/**
 * Sample of Abstract Class
 * Sample explain how to calculate phone price via phone brands
 * @author stkey
 * @version 0.0.1
 * @customize Abstraact Class
 * @return Phone Prices by Brands
 * @since 17.11.2022
 */

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.basePhoneManager = new HuaweiPhoneManager("p20 Lite");
        //customerManager.basePhoneManager = new SamsungPhoneManager("A4 PRO");
        //customerManager.basePhoneManager = new ApplePhoneManager("Iphone 14 Pro Max");
        customerManager.infoMessage();
        customerManager.doTheShopping();
    }
}
