public class Main {
    public static void main(String[] args) {

        System.out.println("Hey, its PIGGY BANK!!!!");
        PiggyBank piggyBank = new PiggyBank();

        // Sets initial balance
        piggyBank.setBalance(100);

        //Instantiate the person
        Person person = new Person(piggyBank);


        person.earnMoney(100);
        System.out.println(person);

        person.spendMoney(100);
        System.out.println(person);
    }
}
