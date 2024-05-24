public class PiggyBank {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        if(amount <= balance){
           balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "PiggyBank has " + balance + "€";
    }
}
