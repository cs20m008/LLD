package InventoryManagementSystem;

import InventoryManagementSystem.WareHouse.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Warehouse>warehouseList=new ArrayList<>();

    public Inventory() {

    }
    public void addWarehouse(Warehouse warehouse)
    {
        warehouseList.add(warehouse);
    }
    public void deleteWarehouse(Warehouse warehouse)
    {
        warehouseList.remove(warehouse);
    }

}
