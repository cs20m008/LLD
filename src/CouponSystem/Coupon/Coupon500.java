package CouponSystem.Coupon;

import CouponSystem.Product.Product;

public class Coupon500 extends Coupon{
    public Coupon500(Product product) {
        super(product);
        product.setPrice(product.getPrice()-500);
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int amount) {

    }
}
