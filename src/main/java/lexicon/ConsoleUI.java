package lexicon;

import java.util.Scanner;

/*
This class is responsible for interacting with user through a console based UI.
 */
public class ConsoleUI {

    private IVendingMachine machine;
    Scanner scanner = new Scanner(System.in);

    public ConsoleUI(IVendingMachine machine) {
        this.machine = machine;
    }

    //This method used to start the application.
    public void start() {

        displayMenu();  //Displays the Vending Machine Menu
        boolean runMachine = true;
        while (runMachine) {
            System.out.print("Choose an option: ");
            String selectedOption = scanner.next();
            switch (selectedOption) {
                case "1":
                    displayAvailableProducts();
                    break;
                case "2":
                    System.out.print("Insert the coin: ");
                    String continuePurchase = machine.insertCoin(scanner.nextInt());
                    System.out.println();
                    break;
                case "3":
                    purchaseAProduct();
                    break;
                case "4":
                    System.out.println();
                    System.out.println("Thanks, Good Bye!");
                    runMachine = false;
                    break;
                default:
                    System.out.println("Invalid option, try again!");
            }

        }
    }

    /*
    This method used to displays the Menu items.
     */
    public void displayMenu() {

        System.out.println("Welcome to Vending Machine");
        System.out.println("===========================");
        System.out.println("1. View available Products");
        System.out.println("2. Insert a coin");
        System.out.println("3. Purchase a product");
        //System.out.println("4. Return Change");
        System.out.println("4. Exit");
        System.out.println();
    }

    /*
    This method displays the list of products available.
     */
    public void displayAvailableProducts() {
        System.out.println("List of Products: ");
        System.out.println("-----------------");
        int counter = 1;
        for (Product product : machine.getProducts()) {
            System.out.println(counter + ". " + "Id: " + product.getId() + " | Name: " + product.getName() +
                    " | Price: " + product.getPrice() + " | Qty: " + product.getQuantity());
            counter++;
        }
        System.out.println();
    }

    /*
    This method process the purchase of the product.
     */
    public void purchaseAProduct() {
        System.out.print("Enter the Id to purchase the product: ");
        Product selectedProduct = machine.purchaseProduct(scanner.nextInt());
        if (selectedProduct != null) {
            System.out.println("Purchased: " + selectedProduct.getDescription());
        }

        System.out.println("The remaining balance is " + machine.returnChange());
    }
}
