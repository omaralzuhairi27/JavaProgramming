package MTWeek3.src.Exercise2;

import MTWeek3.src.Exercise1.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateChooserTest {
    private TemplateChooser templateChooser = new TemplateChooser();

    @Test
    void chooseTemplate() {
    }

    @Test
    void testManTemplate() {
        Customer customer = new Customer("Mr.Rabi", "busniss");
        String message = templateChooser.chooseTemplate(customer);
        assertEquals("man", message);
    }

    @Test
    void testWomenTemplate() {
        Customer customer = new Customer("Ms.fdfg", "busniss");
        String message = templateChooser.chooseTemplate(customer);
        assertEquals("women", message);
    }

    @Test
    void testPrivilegedTemplate() {
        Customer customer = new Customer("rgrHokopoko", "busniss");
        String message = templateChooser.chooseTemplate(customer);
        assertEquals("privileged", message);

    }

    @Test
    void testDefaultTemplate() {
        Customer customer = new Customer("rgrHokopdsoko", "busniss");
        String message = templateChooser.chooseTemplate(customer);
        assertEquals("default", message);
    }
}