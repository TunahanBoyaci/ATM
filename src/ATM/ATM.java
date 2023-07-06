package ATM;
import java.util.Scanner;

public class ATM {

    public void calis(Account account1){
        Login login1 = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");

        int entryAttempt = 3;

        while (true){
            if (login1.login(account1)){
                break;
            }
            else {
                entryAttempt -= 1;
                System.out.println("Remaining entry attempt:" + entryAttempt);
            }

            if (entryAttempt == 0){
                System.out.println("Unsuccessful entry attempt");
                return;
            }
        }

        System.out.println("*********************");
        String text = "1. Deposit\n"
                + "2. Withdrawl\n"
                + "3. View balance\n"
                + "4. Quit";
        System.out.println(text);
        System.out.println("*********************");

        while (true){
            System.out.println("Please choose one option: ");
            int input = scanner.nextInt();

            if (input == 1){
                System.out.println("Please enter deposit amount");
                int depositAmount = scanner.nextInt();
                account1.deposit(depositAmount);
            }
            else if (input == 2){
                System.out.println("Please enter withdrawl amoutn");
                int withdrawlAmount = scanner.nextInt();
                account1.withdrawl(withdrawlAmount);
            }
            else if (input == 3){
                System.out.println("Current Balance : ");
                System.out.println(account1.getBalance());
            }
            else if (input == 4){
                System.out.println("Exit");
                return;
            }
            else {
                System.out.println("Invalid entry");
            }
        }
    }
}