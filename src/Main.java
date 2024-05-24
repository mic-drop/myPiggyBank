public class Main {
    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();
        piggyBank.setBalance(50);

        piggyBank.deposit(50);
        System.out.println(piggyBank);

        piggyBank.withdraw(200);
        System.out.println(piggyBank);
    }
}
