public class DepositTransaction implements TransactionInterface {
    private BankAccount account;
    private double amount;

    public DepositTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);  // Assuming there's a deposit method in BankAccount
    }
}
