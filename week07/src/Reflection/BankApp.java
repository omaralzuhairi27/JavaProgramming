package week07.src.Reflection;

import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        //redTheFile();

        BankApp bankApp = new BankApp();
        bankApp.transfarSalary();
        bankApp.getTheAmount();
        bankApp.gettheHightSallary();
        // bankApp.getTheMostPayingDepartment();
    }

    public void gettheHightSallary() {
        List <Employed> employeds = Employees.asList();
        Integer value = 0;
        String name = "";
        String department = "";
        for (Employed employed : employeds) {
            if (Integer.valueOf(employed.getSalary()) > value) {
                value = Integer.valueOf(employed.getSalary());
                name = employed.getName();
                department = employed.getDepartment();
            }
        }
        System.out.println("Highest salary employee: " + name + " from " + department + " with " + value + "€");

    }

    public void transfarSalary() {
        List <Employed> employeds = Employees.asList();
        Bank bank = new Bank();
        for (Employed employed : employeds) {
            bank.transfer(employed.getSalary(), employed.getAccount());
        }
    }

  /*  public void getTheMostPayingDepartment() {
        List <Employed> employeds = Employees.asList();
        Map<String, Integer> maxSalary = new HashMap<>();


        Integer value=0;
        String department="";

            for(Employed emp : employeds) {
                for (String dep : departments) {
                    if(dep.equals(emp.getDepartment())){
                    value+=Integer.valueOf(emp.getSalary());
                    department=dep;
                }
            }
            maxSalary.put(value,department);
        }
        System.out.println(maxSalary);

        }*/


    public void getTheAmount() {
        Integer total = 0;
        List <Employed> employeds = Employees.asList();
        for (Employed employed : employeds) {
            total += Integer.valueOf(employed.getSalary());
        }
        System.out.println("Total amount paid: " + total);
    }

    public void redTheFile() {

        List <Employed> employeds = Employees.asList();
        for (Employed employed : employeds) {
            System.out.println(employed);
        }
    }


}

