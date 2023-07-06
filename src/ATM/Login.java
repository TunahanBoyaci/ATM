package ATM;
import java.util.Scanner;

public class Login {
    public boolean login(Account account1){
        Scanner scanner = new Scanner(System.in);

        System.out.println("User ID: ");
        String userId = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (userId.equals(account1.getUserId()) && password.equals(account1.getPassword())){
            System.out.println("Login Successful");
            return true;
        }
        else if (!userId.equals(account1.getUserId()) && password.equals(account1.getPassword())){
            System.out.println("User ID is wrong");
            return false;
        }
        else if (userId.equals(account1.getUserId()) && !password.equals(account1.getPassword())){
            System.out.println("Password is wrong");
            return false;
        }
        else {
            System.out.println("Both User ID and Password are wrong");
            return false;
        }
    }
}