package week07.src.Reflection;

public class Employed {
    private String name;
    private String department;
    private String salary;
    private String account;

    public Employed(String name, String department, String salary, String account) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSalary() {
        return salary;
    }

    public String getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name  +"\t"+
                "\t"+"department: " + department +"\t"+
                "\t"+"salary= " + salary +"€"+"\t\t"+
                "\t"+"account: " + account ;
    }


}
