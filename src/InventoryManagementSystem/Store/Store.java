package InventoryManagementSystem.Store;

import InventoryManagementSystem.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    List<Item>itemList=new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addItem(Item item)
    {
        itemList.add(item);
    }
    public void deleteItem(Item item)
    {
        itemList.remove(item);
    }
}
