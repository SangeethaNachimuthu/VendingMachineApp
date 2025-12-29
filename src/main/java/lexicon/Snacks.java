package lexicon;

public class Snacks extends Product {

    public Snacks(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public String getDescription() {
        return "Snack: " + getName();
    }
}
