import java.time.LocalDateTime;
public class BankAccountTransaction {
    private int id;
    private LocalDateTime datetime;
    private String type;
    private double amount;
    private String description;
    private BankAccount sourceAccount;  // For transfer scenarios
    private BankAccount destinationAccount;  // For transfer scenarios
    private String status;
    private BankAccount account;  // Account involved in the transaction

    private TransactionInterface transactionCommand;

    public BankAccountTransaction(int id, LocalDateTime datetime, String type, double amount, String description, BankAccount account) {
        this.id = id;
        this.datetime = datetime;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.account = account;
    }

    public void setTransactionCommand(TransactionInterface command) {
        this.transactionCommand = command;
    }

    public void executeTransaction() {
        transactionCommand.execute();
        updateTransactionStatus();
    }

    private void updateTransactionStatus() {
        // Update transaction status after execution
        this.status = "Completed";
    }

    // Getters and setters for all fields
}
