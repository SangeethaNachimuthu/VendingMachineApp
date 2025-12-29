package lexicon;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements IVendingMachine{

    private List<Product> productList = new ArrayList<>();
    private int balance;


    @Override
    public void insertCoin(int coin) {

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public Product purchaseProduct(int productId) {
        return null;
    }

    @Override
    public int returnChange() {
        return 0;
    }

    @Override
    public List<Product> getProducts() {
        return List.of();
    }
}
