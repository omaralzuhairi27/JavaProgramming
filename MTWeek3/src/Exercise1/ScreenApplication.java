package MTWeek3.src.Exercise1;

public class ScreenApplication {

    public static void main(String[] args) {
        Customer customer=new Customer("ahmad","business");
        Screen screen=new Screen();
        screen.displayName(customer);
    }

}
