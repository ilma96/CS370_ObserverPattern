public class FactoryProductStatusOne implements Inventory {
    // 1. Factory class is implementing Inventory Interface because it is the Observer.
    //2. Overrides update() from Inventory Interface to print out a message from Message Class.
  

    @Override
    public void update(Message m) {
        System.out.println("The item, 'Kitchen Knife Set' : " + m.getMessageContent());
    }
}

