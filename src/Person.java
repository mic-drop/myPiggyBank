public class Person {
    PiggyBank piggyBank;

    public Person(PiggyBank piggyBank) {
        this.piggyBank = piggyBank;
    }

    public void spendMoney(int amount){
        piggyBank.withdraw(amount);
    }

    public void earnMoney(int amount){
        piggyBank.deposit(amount);
    }

    @Override
    public String toString() {
       return "Person has " + piggyBank.getBalance() + "€";
    }
}
