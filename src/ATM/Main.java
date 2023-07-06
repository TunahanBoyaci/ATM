package ATM;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Tuna1","123",1000);

        ATM atm1 = new ATM();

        atm1.calis(account1);
    }
}