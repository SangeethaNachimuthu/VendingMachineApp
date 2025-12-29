package lexicon;

/*
  Represents a snack product in the vending machine.
  This class extends Product and provides a specific description for snack items.
 */
public class Snacks extends Product {

    public Snacks(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public String getDescription() {
        return "Snack: " + getName();
    }
}
