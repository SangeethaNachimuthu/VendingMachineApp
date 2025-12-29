package lexicon;

/*
  Represents a fruit product in the vending machine.
  This class extends Product and provides a specific description for fruit items.
 */
public class Fruit extends Product{

    public Fruit(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public String getDescription() {
        return "Fruit - " + getName();
    }
}
