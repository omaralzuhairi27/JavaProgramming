package MTWeek3.src.Exercise2;


import MTWeek3.src.Exercise1.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        Customer customer=new Customer("Mr.rabi","");
        Customer customer1=new Customer("Mr.omar","");
        Customer customer2=new Customer("Ms","");
        Customer customer3=new Customer("Mrs","");
        TemplateChooser templateChooser=new TemplateChooser();
        System.out.println(templateChooser.chooseTemplate(customer));
        System.out.println(templateChooser.chooseTemplate(customer1));
        System.out.println(templateChooser.chooseTemplate(customer2));
        System.out.println(templateChooser.chooseTemplate(customer3));
    }


}
