public class Main2 {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("PL12345", 1000);
        BankAccount acc2 = new BankAccount("PL98765");

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println("wypłata od bossa w wysokości 10% salda (troche lipa ale cóż)");
        BankAccount acc3 = acc1.withInterest(10);
        System.out.println(acc3);
    }
}
