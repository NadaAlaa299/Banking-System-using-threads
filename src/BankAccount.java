public class BankAccount {
    private int balance;

    public BankAccount(int balance)
    {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Current Balance: " + balance);
    }

    public  void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Current Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw: " + amount + " but insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println(Thread.currentThread().getName() + " checked balance: " + balance);
    }
}
