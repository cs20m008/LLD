package InventoryManagementSystem.Item;

public class Electronics implements Item{
    String name;

    public Electronics(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("ElectronicsItem "+ name);
    }
}
