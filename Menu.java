//1. Menu class interacts with the Inventory class to know if a product is in stock or not. [Completed]

public interface Menu {
     void attach(Inventory is); //for in-stock products
     void detach(Inventory oos); //for out-of-stock products
     void notifyUpdate(Message m);
}
