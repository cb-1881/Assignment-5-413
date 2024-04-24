import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        // Instantiate BankAccount using a builder if previously defined
        // For demonstration, directly using constructor as builders for BankAccount are not shown
        BankAccount myAccount = new BankAccount("Savings", 100000.00);
        
        // Show initial state of the account
        System.out.println("Initial account state: " + myAccount);

        // Instantiate a deposit transaction using the Command pattern
        DepositTransaction deposit = new DepositTransaction(myAccount, 500.00);
        BankAccountTransaction depositTransaction = new BankAccountTransaction(
                1, LocalDateTime.now(), "Deposit", 500.00, "Deposit into savings", myAccount);
        depositTransaction.setTransactionCommand(deposit);
        depositTransaction.executeTransaction();

        // Print the account state after deposit
        System.out.println("Account state after deposit: " + myAccount);

        // Instantiate a withdrawal transaction using the Command pattern
        WithdrawTransaction withdraw = new WithdrawTransaction(myAccount, 200.00);
        BankAccountTransaction withdrawTransaction = new BankAccountTransaction(
                2, LocalDateTime.now(), "Withdrawal", 200.00, "Withdrawal from savings", myAccount);
        withdrawTransaction.setTransactionCommand(withdraw);
        withdrawTransaction.executeTransaction();

        // Print the account state after withdrawal
        System.out.println("Account state after withdrawal: " + myAccount);
    }
}
