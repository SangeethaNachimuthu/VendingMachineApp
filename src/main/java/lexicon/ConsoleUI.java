package lexicon;

import java.util.Scanner;

public class ConsoleUI {

    private IVendingMachine machine;
    Scanner scanner = new Scanner(System.in);

    public ConsoleUI(IVendingMachine machine) {
        this.machine = machine;
    }

    public void start() {
        System.out.println("Welcome to Vending Machine");
        System.out.println("=============================");

        System.out.print("Insert the coin: ");
        String continuePurchase = machine.insertCoin(scanner.nextInt());
        System.out.println();

        if (continuePurchase.equals("yes")) {
            System.out.println("List of Products: ");
            System.out.println("--------------------");
            for (Product product : machine.getProducts()) {
                System.out.println("Id: " + product.getId() + " | Name: " + product.getName() +
                        " | Price: " + product.getPrice() + " | Qty: " + product.getQuantity());
            }
            System.out.println();

            System.out.print("Enter the Id to purchase the product: ");
            Product selectedProduct = machine.purchaseProduct(scanner.nextInt());

            if (selectedProduct != null) {
                System.out.println("Purchased: " + selectedProduct.getDescription());
            }
        }
        System.out.println();
        System.out.println("Thanks, Good Bye!");
    }
}
