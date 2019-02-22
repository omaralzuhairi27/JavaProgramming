package MTWeek3.src.Exercise1;

public class Screen {

    public void displayName(Customer customer) {
        System.out.println(formatName(customer));
    }

    String formatName(Customer customer) {
        String name = customer.getName();
        if (customer.getCategory().equals("business")) {
            return name.toUpperCase();
        }
        return name.toLowerCase();
    }
}
