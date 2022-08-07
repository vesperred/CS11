import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private double checkBalance;
    private double savingBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<Deposit> deposits) {
        this.deposits = deposits;
    }

    public ArrayList<Withdraw> getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(ArrayList<Withdraw> withdraws) {

        /* This is not additive, replaces */
        this.withdraws = withdraws;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingRate() {
        return savingRate;
    }

    public void setSavingRate(double savingRate) {
        this.savingRate = savingRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOVERDRAFT() {
        return OVERDRAFT;
    }

    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        accountNumber = 0;
        checkBalance = 0;
        savingBalance = 0;
        savingRate = 0;
        name = "Unknown";


    }
    Customer(String name, int accountNumber, double checkBalance, double savingBalance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkBalance;
        this.savingBalance = savingBalance;


    }

    /*
    * Requires: amt>=0
    * Modifies: checkBalance or savingBalance
    * Effects: adds amt to checkBalance or savingBalance*/
    public double deposit(double amt, Date date, String account){
        double amountDeposited = amt;
        if(account == CHECKING) {

            deposits.add(new Deposit(amt, date, account));
            System.out.println(deposits);
            checkBalance+=amountDeposited;
        }
        else if (account == SAVING){

            deposits.add(new Deposit(amt, date, account));
            System.out.println(deposits);
            savingBalance+=amountDeposited;
        }
        return amountDeposited;
    }

    /* Requires: amt>0
    *  Modifies: savingBalance or checkBalance
    *  Effects: Adds amt to savingBalance or checkBalance if there is no overdraft
    * */
    public double withdraw(double amt, Date date, String account){
        double amountWithdrawn = 0;
        if (checkOverdraft(amt,account) == false){
            if(account == SAVING) {
                withdraws.add(new Withdraw(amt, date, account));
                System.out.println(withdraws);
                amountWithdrawn = amt;
                savingBalance-=amountWithdrawn;

            }
            else if (account == CHECKING){
                withdraws.add(new Withdraw(amt, date, account));
                System.out.println(withdraws);
                amountWithdrawn = amt;
                checkBalance-=amountWithdrawn;

            }

        }
        else{
            System.out.println("Could not be processed due to overdraft");
        }
        return amountWithdrawn;

    }

    /*
    * Requires: account to be either checking or saving
    * Modifies: nothing
    * Effects:  if overdraft is detected, it negates the effects of the withdraw method
    * */
    private boolean checkOverdraft(double amt, String account){
        //Default to savings, else checking
        boolean isChecking = false;
        double balance = 0;
        boolean returnCode = false;
        if(account == CHECKING){
            isChecking = true;
            balance = checkBalance;
        }
        else if (account == SAVING){
            isChecking = false;
            balance = savingBalance;
        }
        else{
            System.out.println("Invalid input");
        }
        if((balance-amt) <= OVERDRAFT){
            returnCode = true;
        }

        return returnCode;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
