package MTWeek3.src.Exercise2;


import MTWeek3.src.Exercise1.Customer;

public class TemplateChooser {
    public String chooseTemplate(Customer customer) {

        if (customer.getName().startsWith("Mr")) {
            return "man";
        } else if (customer.getName().startsWith("Ms") || customer.getName().startsWith("Mrs")) {
            return "women";
        }else if(customer.getName().contains("Hokopoko")){
            return "privileged";
        }
        return "default";
    }
}



