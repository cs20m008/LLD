package CouponSystem.Coupon;

import CouponSystem.Product.Product;

public class Coupon100 extends Coupon {
    public Coupon100(Product product) {
        super(product);
        product.setPrice(product.getPrice()-100);
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int amount) {

    }
}
