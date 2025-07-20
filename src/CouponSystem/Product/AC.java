package CouponSystem.Product;

public class AC implements Product{
    int price=50000;
    public AC()
    {

    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int amount) {
     price=amount;
    }
}
