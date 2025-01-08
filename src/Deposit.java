public class Deposit extends Thread{
    private BankAccount account;
    private int amount;

    public Deposit(BankAccount account, int amount)
    {
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        account.deposit(amount);
    }
}
