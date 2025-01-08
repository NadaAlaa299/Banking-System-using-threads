public class Withdraw {
    private BankAccount account;
    private int amount;

    public Withdraw(BankAccount account, int amount)
    {
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        account.withdraw(amount);
    }
}
