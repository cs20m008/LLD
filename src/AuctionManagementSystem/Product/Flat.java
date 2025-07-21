package AuctionManagementSystem.Product;

public class Flat implements Product {
    int price;

    public Flat(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
