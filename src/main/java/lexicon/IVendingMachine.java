package lexicon;

import java.util.List;

public interface IVendingMachine {

    String insertCoin(int coin);

    int getBalance();

    Product purchaseProduct(int productId);

    int returnChange();

    List<Product> getProducts();
}
