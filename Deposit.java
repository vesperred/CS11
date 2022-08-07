import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
       String tempString = "Deposit of: " + this.amount + " Date: " + this.date + " to account: " + this.account;
        return tempString;
    }
}