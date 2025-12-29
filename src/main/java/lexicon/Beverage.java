package lexicon;

/*
  Represents a beverage product in the vending machine.
  This class extends Product and provides a specific description for beverage items.
 */
public class Beverage extends Product{

    public Beverage(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public String getDescription() {
        return "Beverage: " + getName();
    }
}
