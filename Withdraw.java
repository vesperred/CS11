import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        String tempString = "Withdrawal of: " + this.amount + " Date: " + this.date + " from account: " + this.account;
        return tempString;
    }
}
