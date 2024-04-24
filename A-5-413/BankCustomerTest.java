

import java.util.*;

public class BankCustomerTest {

    public static void main(String[] args) {
        // Step 1: Instantiate a BankCustomer
        BankCustomer customer = new BankCustomer();

        // Step 2: Instantiate BankCustomerBuilder and set attributes
        BankCustomer builtCustomer = new BankCustomer.BankCustomerBuilder()
            .setName("John Doe")
            .setPhone("123-456-7890")
            .setEmail("john.doe@example.com")
            .setBirthday("1990-01-01")
            .setAddress(new CustomerAddress(123, "Main St", "Cityville", "Stateville", 12345)
            )
            .setAccounts(Arrays.asList(new BankAccount("Checking", 1500.00), new BankAccount("Savings", 3000.00)))
            .build();

        // Step 3: Print out the created BankCustomer details
        System.out.println("Created Bank Customer Details:");
        System.out.println("Customer Number: " + builtCustomer.getCustomerNumber());
        System.out.println("Name: " + builtCustomer.getName());
        System.out.println("Email: " + builtCustomer.getEmail());
        System.out.println("Phone: " + builtCustomer.getPhone());
        System.out.println("Birthday: " + builtCustomer.getBirthday());
        System.out.println("Address: " + builtCustomer.getAddress());
        System.out.println("Accounts: " + builtCustomer.getAccounts());
    }
}
