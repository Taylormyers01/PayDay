package rocks.zipcode;

import static org.junit.jupiter.api.Assertions.*;

class PayDayTest {

    @org.junit.jupiter.api.Test
    void pay() {
        PayDay payDay1 = new PayDay();
        java.lang.String string1 = payDay1.pay("Kris", 21.5, 10.0, 0.05);

        assertEquals("Kris 215.00 10.75 204.25", string1);
    }
}