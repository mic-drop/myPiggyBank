public class Main {
    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();
        piggyBank.setBalance(100);

        Person person = new Person(piggyBank);

        person.earnMoney(100);
        System.out.println(person);

        person.spendMoney(100);
        System.out.println(person);
    }
}