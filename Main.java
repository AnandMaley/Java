import java.util.ArrayList;

class BankAccount{
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Enter Valid Amount");
        }else{
            balance += amount;
            System.out.println("Deposited "+amount);
            getBalance();
        }
    }
    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("Enter Valid Amount");
        }else if(balance == 0){
            System.out.println("No balance amount");
            getBalance();
        }else{
            if(balance>0){
                if(balance>=amount){
                    balance -= amount;
                    System.out.println("withdraw "+amount);
                    getBalance();
                }
            }
        }
    }
    public String getAccNo(){
        return this.accountNumber;
    }
    public void getBalance(){
        System.out.println("Acc.No: "+getAccNo()+"\nAmount: "+balance);
    }
}

public class Main{
    public static void main(String[] args) {
        /* 
        BankAccount A = new BankAccount("123456789", 1000);
        A.deposite(10);
        A.withdraw(10);
        A.getBalance();
        System.out.println("Acc.No: "+A.getAccNo());
        */

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("12354689", 500));
        accounts.add(new BankAccount("12354698", 500));
        accounts.add(new BankAccount("12354679", 500));
        accounts.get(0).deposit(500);  
        System.out.println();
        accounts.get(1).withdraw(300);  
        System.out.println();
        accounts.get(2).getBalance();
    }    
}
