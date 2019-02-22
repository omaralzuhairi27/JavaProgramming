package MTWeek3.src.Exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScreenTest {

    private Screen screen = new Screen();

    @Test
    void testBusinessCustomer() {
        Customer customer = new Customer("rabi", "business");
        String message = screen.formatName(customer);
        assertEquals("RABI", message);
    }

    @Test
    void testEconomicCustomer() {
        Customer customer = new Customer("rabi", "economic");
        String message=screen.formatName(customer);
        assertEquals("rabi",message);
    }




}