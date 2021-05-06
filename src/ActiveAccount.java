public class ActiveAccount implements Command {
    private Account account;

    public ActiveAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.active();
    }
}