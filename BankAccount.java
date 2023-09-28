public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    // didn't use this one
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
    }
    // use this one for BankTest
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return savingsBalance;
    }

    public static int getAccounts(){
        return accounts;
    }
    public static double getTotalMoney(){
        return totalMoney;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
        //updating...similar to setters
    public void deposit(double amount, String accountType){
        if(accountType == "saving"){
            this.savingsBalance += amount; 
            // static , do not use "this."" 
            totalMoney +=  amount;
        }
        else if (accountType == "checking" ){
            this.checkingBalance += amount;
            totalMoney += amount;
        }
    }
    

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double amount, String accountType){
        if(accountType == "saving"){
            // if they choose saving check if there are sufficent funds 
            if(this.savingsBalance < amount){
                System.out.println("❌ You don't have sufficeint funds to withdraw from savings! You have: " +this.savingsBalance);
            }
            // withdraw allowed
            else{    
            this.savingsBalance -= amount;
            totalMoney -= amount;
            System.out.println("✅ You have sucessfully withdrawn: " + amount);
            }
        }
            
        else if (accountType == "checking"){
            // if they choose checking account, check if there are sufficent funds
            if(this.checkingBalance < amount){
                System.out.println("❌ You don't have sufficeint funds to withdraw from checking account! You have: " +this.checkingBalance);
            }
            // withdraw allowed 
            else{
            this.checkingBalance -= amount;
            totalMoney -= amount;
            System.out.println("✅ You have sucessfully withdrawn: " + amount);
            }
        }
    }


    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance(){
        return checkingBalance + savingsBalance;
    }
}
