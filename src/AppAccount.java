public class AppAccount {
    private Command openAccount;
    private Command closeAccount;

    public AppAccount(Command openAccount, Command closeAccount) {
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
    }

    public void clickOpenAccount(){
        openAccount.execute();
    }

    public void clickCloseAccount(){
        closeAccount.execute();
    }
}