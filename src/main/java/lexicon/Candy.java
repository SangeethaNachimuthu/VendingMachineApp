package lexicon;

/*
  Represents a candy product in the vending machine.
  This class extends Product and provides a specific description for candies.
 */
public class Candy extends Product{

    public Candy(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public String getDescription() {
        return "Candy: " + getName();
    }
}
