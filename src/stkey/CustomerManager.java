package stkey;

import java.util.Scanner;

/**
 * Calculating OTV Price via Phone Base Price
 *
 * @author stkey
 * @version 0.0.1
 * @add Brand of Phone
 * @return phoneModel & totalPrice
 * @since 17.11.2022
 */
public class CustomerManager {
    // Description for doing processes in Different classes(Like Database Example)
    BasePhoneManager basePhoneManager;
    Scanner scanner = new Scanner(System.in);
    int phonePrice;
    double phoneOtv;

    void infoMessage() {
            System.out.print(" Telefon Geliş Ücreti: ");
            phonePrice = scanner.nextInt();
            // OTV işlemleri için
            if (phonePrice >= 3000) {
                phoneOtv = 0.5;
            } else if (phonePrice > 1500) {
                phoneOtv = 0.4;
            } else {
                phoneOtv = 0.25;
            }
            System.out.println("ÖTV Ücreti: %" + phoneOtv * 100);
    }

    void doTheShopping() {
        System.out.println(" Telefon Markası: " + basePhoneManager.getPhoneBrand());
        System.out.println(" Telefon Modeli: " + basePhoneManager.phoneModel);
        System.out.println(" Telefon Fiyatı: " + basePhoneManager.buyTelephone(phonePrice, phoneOtv));
    }
}

/*
Resmi Gazete'de yayımlanan karara göre Özel Tüketim Vergisi matrahı
1.500 TL'yi aşmayan cep telefonlarında vergi oranı yüzde 25 oldu.
1.500-3 bin TL arasında olan cep telefonlarında vergi oranı yüzde 40 olarak belirlenirken
3 bin TL'nin üzerindeki telefonlardan alınan yüzde 50'lik matrah oranı değişmedi.
*/
