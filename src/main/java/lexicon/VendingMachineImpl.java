package lexicon;

import java.util.ArrayList;
import java.util.List;

/*
This class implements the IVendingMachine interface.
 */
public class VendingMachineImpl implements IVendingMachine{

    private List<Product> productList = new ArrayList<>();
    private int balance;

    public VendingMachineImpl() {
        addProducts();
    }

    /*
    Added products in the list.
     */
    public void addProducts() {
        productList.add(new Snacks(101, "Chips", 30, 15));
        productList.add(new Snacks(102, "Roasted Peanut", 25, 10));
        productList.add(new Snacks(103, "Cheese Balls", 55, 12));
        productList.add(new Beverage(201, "Pepsi", 12, 10));
        productList.add(new Beverage(202, "Fanta", 15, 10));
        productList.add(new Beverage(203, "Sprite", 13, 10));
        productList.add(new Beverage(204, "CocaCola", 10, 10));
        productList.add(new Fruit(301, "Apple", 10, 10));
        productList.add(new Fruit(302, "Pear", 15, 10));
        productList.add(new Fruit(303, "Banana", 9, 10));
        productList.add(new Fruit(304, "Orange", 5, 10));
    }

    @Override
    public void insertCoin(int insertedCoin) {
        for (Coin coin : Coin.values()) {
            if (coin.getCoinValue() == insertedCoin) {
                balance += insertedCoin;
                return;
            }
        }
        System.out.println("Invalid coin, Please insert correct coins.");
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    /*
    Purchases a product by its ID.
    This method checks whether the product is available in stock and
    whether the user has sufficient balance before completing the purchase.
     */
    public Product purchaseProduct(int productId) {
        if (!productList.isEmpty()) {
            for (Product p : productList) {
                if (p.getId() == productId && p.getQuantity() > 0) {
                    if (balance >= p.getPrice()) {
                        balance -= p.getPrice();
                        p.setQuantity(p.getQuantity()-1);
                        return p;
                    } else {
                        System.out.println("Insufficient balance to purchase the product!");
                    }
                }
            }
        }
        System.out.println("Invalid product id, Please select the available products!");
        return null;
    }

    @Override
    /*
    This method calculates the remaining balance after the purchase.
     */
    public int returnChange() {
        int remainingBalance = balance;
        balance = 0;
        return remainingBalance;
    }

    @Override
    public List<Product> getProducts() {
        return productList;
    }
}
