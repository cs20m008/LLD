package InventoryManagementSystem.Item;

public class Sports implements Item{
    String name;

    public Sports(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("ElectronicsItem "+ name);
    }
}
