

import java.util.*;

public class BankCustomer implements Comparable<BankCustomer> {

    private static ArrayList<BankCustomer> customers = new ArrayList<>();
    private static int custCount = 0;
    String firstName;
    String lastName;
    String phone;
    String email;
    String birthday;
    int customerNumber;
    List accounts = new ArrayList<BankAccount>();
    CustomerAddress address;
    private String name;  // Ensure this is declared
     //private String phone;


    public BankCustomer() {}

    public BankCustomer(String fName, String lName) {
        firstName = fName;
        lastName = lName;
        customers.add(this);
        customerNumber = ++custCount;
    }

    public BankCustomer(int num, String fName, String lName) {
        firstName = fName;
        lastName = lName;
        customers.add(this);
        customerNumber = num;
    }    


// Inner Builder Class
// Inner Builder Class
public static class BankCustomerBuilder {
    private String name;  // Corrected from 'private string name;'
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String birthday;
    private List<BankAccount> accounts = new ArrayList<>();
    private CustomerAddress address;


    public BankCustomerBuilder setName(String name) {
        this.name = name;
        return this; // should return an instance of BankCustomerBuilder
    }

    
    public BankCustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BankCustomerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BankCustomerBuilder setPhone(String phone) {
        this.phone = phone;
        return this; // Return the current instance of the builder
    }
    

    public BankCustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public BankCustomerBuilder setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public BankCustomerBuilder setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
        return this;
    }

    public BankCustomerBuilder setAddress(CustomerAddress address) {
        this.address = address;
        return this;
    }

    public BankCustomer build() {
        BankCustomer customer = new BankCustomer();
        customer.name = this.name;
        customer.firstName = this.firstName;
        customer.lastName = this.lastName;
        customer.phone = this.phone;
        customer.email = this.email;
        customer.birthday = this.birthday;
        customer.accounts = this.accounts;
        customer.address = this.address;
        customer.customerNumber = ++custCount;
        customers.add(customer);
        return customer;
    }
}

    // Existing methods and properties...

  

    @Override
    public int compareTo(BankCustomer other) {
        return this.name.compareTo(other.name);
    }

    // Ensure getters and setters are appropriately defined
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
       String str = "\n";
       str += this.getCustomerNumber();
       str += " : " + this.getName();
       str += " : " + this.getAddress();
       System.out.println(str);
       return str;
    }

    

    public static ArrayList<BankCustomer> getCustomers() {
        return customers;
    }

    public static void setCustomers(ArrayList<BankCustomer> customers) {
        BankCustomer.customers = customers;
    }

    public static int getCustCount() {
        return custCount;
    }

    public static void setCustCount(int custCount) {
        BankCustomer.custCount = custCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public List getAccounts() {
        return accounts;
    }

    public void setAccounts(List accounts) {
        this.accounts = accounts;
    }

    public CustomerAddress getAddress() {
        return address;
    }

    public void setAddress(CustomerAddress address) {
        this.address = address;
    }

}
