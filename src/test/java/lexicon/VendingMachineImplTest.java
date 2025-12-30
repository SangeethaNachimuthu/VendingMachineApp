package lexicon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineImplTest {

    VendingMachineImpl machine = new VendingMachineImpl();

    @Test
    void validateBalanceWhenValidCoinIsInserted() {

        machine.insertCoin(10);
        assertEquals(10, machine.getBalance());
    }

    @Test
    void validateBalanceWhenInvalidCoinIsInserted() {

        machine.insertCoin(7);
        assertEquals(0, machine.getBalance());
    }

    @Test
    void validatePurchaseProductSuccessfully() {

        machine.insertCoin(20);
        Product product = machine.purchaseProduct(201);

        assertNotNull(product); //Purchase succeeds
        assertEquals(8, machine.returnChange());
        assertEquals(0, machine.getBalance());
        assertEquals(9, product.getQuantity());
    }

    @Test
    void validatePurchaseFailsWhenInsufficientBalance() {

        machine.insertCoin(10);

        Product productBefore = machine.getProducts()
                .stream()
                .filter(p -> p.getId() == 201)
                .findFirst()
                .orElseThrow();

        int initialQuantity = productBefore.getQuantity();

        Product product = machine.purchaseProduct(102);

        assertNull(product);
        assertEquals(10, machine.getBalance());
        assertEquals(initialQuantity, productBefore.getQuantity());
    }
}
