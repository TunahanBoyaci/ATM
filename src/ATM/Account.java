package ATM;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {

    private String userId;
    private String password;
    private int balance;

    public Account (String userId,String password, int balance){
        this.userId = userId;
        this.password = password;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        if (amount <= 0){
            System.out.println("Sorry, invalid amount.");
            System.out.println("Remaining balance: " + balance);
        }
        else {
            System.out.println("Loading...");

            try {
                Thread.sleep(3000);
            }

            catch (InterruptedException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
            balance += amount;
            System.out.println("Money has been deposited");
            System.out.println("New balance: " + balance);
        }
    }

    public void withdrawl(int amount){
        if (amount <= 0){
            System.out.println("Sorry, invalid amount.");
            System.out.println("Remaining balance: " + balance);
        }
        else if (balance - amount < 0){
            System.out.println("Sorry, not enough balance");
            System.out.println("Remaining balance: " + balance);
        }
        else if (amount > 1000){
            System.out.println("Sorry, you have exceeded your daily withdrawl amount.");
            System.out.println("Remaining balance: " + balance);
        }
        else {
            System.out.println("Loading...");

            try {
                Thread.sleep(3000);
            }

            catch (InterruptedException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
            balance -= amount;
            System.out.println("Money has been withdrawled");
            System.out.println("Remaining balance: " + balance);
        }
    }
}
