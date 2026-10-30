class BankAccount {
    private String accountHolder;
    private int balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Asha");
        account.setBalance(1250);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}
