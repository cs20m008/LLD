package InventoryManagementSystem;

import InventoryManagementSystem.Item.Electronics;
import InventoryManagementSystem.Item.Item;
import InventoryManagementSystem.Item.Sports;
import InventoryManagementSystem.Store.Store;
import InventoryManagementSystem.WareHouse.Warehouse;

public class App {
 public static void inventoryManagementSystemMain()
 {
     Item item1=new Electronics("WashingMachine");
     Item item2=new Sports("Bat");
     Item item3=new Electronics("TV");
     Item item4=new Sports("Ball");
     Store store1=new Store("one");
     Store store2=new Store("two");
     Store store3=new Store("three");
     Store store4=new Store("four");
     Warehouse warehouse1=new Warehouse(Location.Prayagraj);
     Warehouse warehouse2=new Warehouse(Location.Kanpur);
     Warehouse warehouse3=new Warehouse(Location.Noida);
     Warehouse warehouse4=new Warehouse(Location.Lucknow);
     store1.addItem(item1);
     store2.addItem(item2);
     store3.addItem(item3);
     store4.addItem(item4);
     warehouse1.addStore(store1);
     warehouse2.addStore(store2);
     warehouse3.addStore(store3);
     warehouse4.addStore(store4);
     Inventory inventory=new Inventory();
     inventory.addWarehouse(warehouse1);
     inventory.addWarehouse(warehouse2);
     inventory.addWarehouse(warehouse3);
     inventory.addWarehouse(warehouse4);
     inventory.deleteWarehouse(warehouse1);
     inventory.deleteWarehouse(warehouse2);



 }
}
