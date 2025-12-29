package lexicon;

import java.util.List;

/*
This is the interface class and implemented in VendingMachineImpl class.
 */
public interface IVendingMachine {

    void insertCoin(int coin);

    int getBalance();

    Product purchaseProduct(int productId);

    int returnChange();

    List<Product> getProducts();
}
