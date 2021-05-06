import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("Kieu Anh");
        Command open = new ActiveAccount(account);
        Command close = new CloseAccount(account);
        AppAccount bank = new AppAccount(open, close);

        bank.clickCloseAccount();
        bank.clickOpenAccount();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a){
            case "O":
            case "N":
//                account.active();
                bank.clickOpenAccount();
        }
    }
}