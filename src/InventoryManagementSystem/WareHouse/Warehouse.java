package InventoryManagementSystem.WareHouse;

import InventoryManagementSystem.Item.Item;
import InventoryManagementSystem.Location;
import InventoryManagementSystem.Store.Store;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private Location location;
    List<Store>storeList=new ArrayList<>();
    public Warehouse(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void addStore(Store store)
    {
        storeList.add((store));
    }
    public void deleteStore(Store store)
    {
        storeList.remove(store);
    }
}
