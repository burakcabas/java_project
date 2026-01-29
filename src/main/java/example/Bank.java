package example;

public class Bank {

    public Bank(int balance){
        this.balance = balance;
    }

    private int balance;

    public void withdraw(int balance) throws InsufficentFundsException{
        if(this.balance>=balance){
            this.balance = this.balance - balance;
            System.out.println("Here is your new total: " + this.balance);
        } else if (this.balance < balance) {
            throw new InsufficentFundsException("You don't have enough money.");
        }
    }

    public static void main(String[] args) throws InsufficentFundsException{

        Bank customer = new Bank(250);

        customer.withdraw(200);
        customer.withdraw(20);
        customer.withdraw(200);

    }

}
