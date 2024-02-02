public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public int addAccount(int account) {
        return accounts = account++;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getcheckingBalance (){
        return this.checkingBalance ;
    }
    public double getsavingsBalance (){
        return this.savingsBalance ;
    }
    public double gettotalMoney (){
        return this.totalMoney ;
    }
    public int getaccount(){
        return this.accounts ;
    }

    // METHODS
    // deposit
    public double deposit(double amount){
        return totalMoney + amount;
    }
    public double depositChecking(double amount){
        return this.checkingBalance +amount ;
    }
    public double depositSaving(double amount){
        return this.savingsBalance +amount  ;
    }

    // - users should be able to deposit money into their checking or savings account
    // withdraw 
    public double withdraw(double amount){
        return totalMoney - amount;
    }

    // - users should be able to withdraw money from their checking or savings account
    public double withdrawChecking(double amount){
        return this.checkingBalance -amount ;
    }
    public double withdrawSaving(double amount){
        return this.savingsBalance -amount  ;
    }
    public double withdrawUserChekingBalance (double amount){
        if (amount > checkingBalance ){
            System.out.println("sold insufficient");
            return -1;}
        else {
            checkingBalance -= amount;
            totalMoney -= amount;
            return checkingBalance;
        }
        }
        public double withdrawUserSavingBalance (double amount){
            if (amount > savingsBalance ){
                System.out.println("sold insufficient");
                return -1;}
            else {
                checkingBalance -= amount;
                totalMoney -= amount;
                return savingsBalance;
            }
            }

    }
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double totalBaalance(){
   
       return  savingsBalance + checkingBalance;
    }

