package lexicon;

public class Main {

    void main() {
        IVendingMachine machine = new VendingMachineImpl();
        ConsoleUI consoleUI = new ConsoleUI(machine);
        consoleUI.start();
    }
}
