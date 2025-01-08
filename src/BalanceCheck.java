public class BalanceCheck extends Thread{
    private BankAccount account;

    public BalanceCheck(BankAccount account)
    {
        this.account = account;
    }

    public void run(){
        account.checkBalance();
    }
}
