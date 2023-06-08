package ariefbelajarjava.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {

        var customer = new Customer();
        customer.setId("100");
        customer.setName("Eko");

        System.out.println(customer.getId());
        System.out.println(customer.getName());

    }

    @Test
    void testConsumerConstructor() {

        var customer = new Customer("ID","NAME");
        Assertions.assertEquals("ID",customer.getId());
        Assertions.assertEquals("NAME", customer.getName());

    }
}