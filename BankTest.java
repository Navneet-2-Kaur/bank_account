public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
    

        


        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        account1.deposit(1000.00, "saving");
        System.out.println("💸 Account 1 checking has $" + account1.getCheckingBalance()); 
        System.out.println("💸 Account 1 savings has $" + account1.getSavingBalance());
        

        account2.deposit(2000.00, "saving");
        System.out.println ("💸 Account 2 checking has $" + account2.getCheckingBalance());
        System.out.println("💸 Account 2 savings has $" + account2.getSavingBalance());

        account3.deposit(3000.00, "checking");
        System.out.println("💸 Account 3 checking has $" + account3.getCheckingBalance());
        System.out.println("💸 Account 3 savings has $" + account3.getSavingBalance());



        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        account1.withdraw(500, "saving");
        account1.withdraw(100, "checking");
        System.out.println("💸 Account 1 total balance is: " + account1.getBalance());

        account2.withdraw(600, "saving");
        account2.withdraw(100, "checking");
        System.out.println("💴 Account 2 total balance is: " + account2.getBalance());

        account3.withdraw(100, "saving");
        account3.withdraw(100, "checking");
        System.out.println("🏦 Account 3 total balance is: " + account3.getBalance());

        


        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("🏦 Total Accounts: " + BankAccount.getAccounts() + " ||💰 The total Money: " + BankAccount.getTotalMoney());

    }
}
