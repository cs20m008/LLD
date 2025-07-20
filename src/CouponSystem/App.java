package CouponSystem;

import CouponSystem.Coupon.Coupon100;
import CouponSystem.Coupon.Coupon500;
import CouponSystem.Product.AC;
import CouponSystem.Product.Product;

public class App {
    public static void CouponSystemMain()
    {
        Product product=new AC();
        product.getPrice();
        new Coupon500(product);
        new Coupon100(product);
        product.getPrice();

    }
}
