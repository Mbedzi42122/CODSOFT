import java.util.Scanner;
class Atm {
    
    private double balance;

    public Atm(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if ( amount>0  &&  amount<=balance) {

            balance -=amount;

            System.out.println("Withdrawal successfully  \nNew balance: " + balance);

        } else {

            System.out.println("Invalid withdrawal amount");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {

            balance +=amount;
            System.out.println("Deposit successfully \nNew balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
}

public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double initialBalance = 100.0;

        Atm atm = new Atm(initialBalance);

        System.out.println("Welcome to ATM");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");

        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.print("Withdrawal Amount: ");
                double withdrawalAmount = input.nextDouble();

                atm.withdraw(withdrawalAmount);

                break;
            case 2:
                System.out.print("Deposit Amount:");
                double depositAmount = input.nextDouble();

                atm.deposit(depositAmount);

                break;
            case 3:
                System.out.println("Balance: " + atm.getBalance());

                break;
            default:
                System.out.println("Invalid option . please try again later !!");

                break;
         
           }

           input.close();
    }
}
