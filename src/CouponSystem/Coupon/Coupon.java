package CouponSystem.Coupon;

import CouponSystem.Product.Product;

public abstract class Coupon implements Product {
    public Product product;

    public Coupon(Product product) {
        this.product = product;
    }
}
