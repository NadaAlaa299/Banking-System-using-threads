public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        Thread t1 = new Deposit(account,500);
        Thread t2 = new Withdraw(account,300);
        Thread t3 = new BalanceCheck(account);
        Thread t4 = new Withdraw(account,1500);
        Thread t5 = new Deposit(account,700);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted" + e.getMessage());
        }

        System.out.println("All transactions completed.");
    }
}