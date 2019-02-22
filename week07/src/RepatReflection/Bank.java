package week07.src.RepatReflection;

public class Bank {
    public void transfer(Employee salary,Employee account){
        System.out.println("Transfer successful:"+ salary.getSalary()+" to account "+account.getAccount()+"\n");
    }
}
