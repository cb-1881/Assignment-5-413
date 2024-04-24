public class WithdrawTransaction implements TransactionInterface {
    private BankAccount account;
    private double amount;

    public WithdrawTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);  // Assuming there's a withdraw method in BankAccount
    }
}
