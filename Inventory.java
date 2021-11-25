public interface Inventory {
    //1. Pattern: Observer Pattern. Because Inventory will act as the main observer. Menu class
    // (I used MenuObserver, which implements Menu Interface) will be the subject. Menu has the attach, detach, notifyUpdate methods.
    //2. We have three Factories that has the status of the product, which implements Inventory Interface.
    // So, the Inventory, as the Observer, is updating the info of an item whether it's in stock or not.



 void update(Message m);
}
