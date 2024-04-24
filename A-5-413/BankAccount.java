import java.time.LocalDate;

public class BankAccount implements Comparable<BankAccount> {
    
    // Create instance variables
    public int accountNum;
    public LocalDate createDate = LocalDate.now(); // Initialize with the current date
    public double balance;
    public String type;
    public int custNum;
    
    static String bankName = "DefaultBankName";
    private int currentNumber = 0;
    
        //1-arg constructor
    BankAccount() {
        accountNum = currentNumber++;
        createDate = LocalDate.now();
        
    }
    
    BankAccount(int actNum) {
        accountNum = actNum;
        createDate = LocalDate.now();
        
    }   
    
    public BankAccount(String accountType, double balance) {
        this.type = type;
        this.balance = balance;
    }
    
    // Setters and getters for the FriscoCommunityBankAccount object
    
    public java.time.LocalDate getCreateDate() {
        return createDate;
    }
    
    public void setCreateDate(java.time.LocalDate aDate) {
        createDate = aDate;
    }    
    
    public double getBalance() {
        return balance;
    }  

    public void setBalance(double aBalance) {
        balance = aBalance;
    }
    
    public String getType() {
        return type;
    }  
    
    public void setType(String tp) {
        type = tp;
    }
    
    public int getAccountNum() {
        return accountNum;
    }
    
    public void setAccountNum(int num) {
        accountNum = num;
    }

        public String getName() {
        return bankName;
    }
    
    public void setBankName(String name) {
        bankName = name;
    }

    public String getCustNum() {
        return type;
    }      

    public void setCustNum(int num) {
        custNum = num;
    }    
    
    @Override
    public int compareTo(BankAccount ba) {
        return this.compareTo(ba);
    }
    
    @Override
    public String toString() {
        
        String str = "[ ";
        
        str += "Num: " + (this.getAccountNum() + " Create Date: " + this.createDate.toString() + " Balance: " + this.getBalance());
        
        return str + " ]";
        
    }

    public static String getBankName() {
        return bankName;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

        // Deposit method
        public void deposit(double amount) {
            if (amount < 0) {
                throw new IllegalArgumentException("Deposit amount cannot be negative.");
            }
            this.balance += amount;
        }
        
        // Withdrawal method
        public void withdraw(double amount) {
            if (amount < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
            }
            if (this.balance >= amount) {
                this.balance -= amount;
            } else {
                throw new IllegalArgumentException("Insufficient funds for withdrawal.");
            }
        }
    
}

