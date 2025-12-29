package lexicon;

/*
The entry point of the application.
This class initializes the vending machine application.
 */
public class Main {

    void main() {
        IVendingMachine machine = new VendingMachineImpl();
        ConsoleUI consoleUI = new ConsoleUI(machine);
        consoleUI.start();
    }
}
