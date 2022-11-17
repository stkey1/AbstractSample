package stkey;

/**
 * @author stkey
 * @version 0.0.1
 * @customize Abstraact Class
 * @add
 * @components
 * @throws
 * @return
 * @since 17.11.2022
 */
public abstract class BasePhoneManager {
    // Variables for phone Brand
    private String phoneBrand;
    public String phoneModel;

    public void setPhoneBrand(String phoneBrand) {
        //setting phone brand
        this.phoneBrand = phoneBrand;
    }

    public String getPhoneBrand() {
        //for returning phone brand
        return phoneBrand;
    }

    public abstract double buyTelephone(int price, double otv);
}
