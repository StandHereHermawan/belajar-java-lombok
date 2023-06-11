package ariefbelajarjava.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {

    @Test
    void testWIth() {

        var register1 = new Register("Hermawan","120303");
        var register2 = register1.withUsername("Arief");

        Assertions.assertEquals(register1.getPassword(),register2.getPassword());
        Assertions.assertNotEquals(register1.getUsername(),register2.getUsername());

    }
}
