import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;


public class DataAbstractionTests {
    Deposit testDeposit;
    @Before
    public void setup(){
        testDeposit = new Deposit(100,new Date(),"Checking");
    }
    @Test
    public void testDeposits(){

        assertEquals("Deposit of: 100.0" + " Date: " + new Date() + " to account: Checking",testDeposit.toString());
    }
    Withdraw testWithdraw;

    @Before
    public void withdrawSetup(){
        testWithdraw = new Withdraw(100,new Date(),"Checking");
    }
    @Test
    public void testWithdraws(){
        assertEquals("Withdrawal of: 100.0" + " Date: " + new Date() + " from account: Checking",testWithdraw.toString());
    }
    Customer John;
    @Before
    public void customerDeposit(){
        John = new Customer("John",1,20000,4000);
    }
    @Test
    public void testCustomerDeposit(){
        John.deposit(200,new Date(),"Checking");
        assertEquals(20200.0,John.getCheckBalance(),0.0);
    }
    Customer James;
    @Before
    public void customerWithdraw(){
        James = new Customer("James",2,1000,5000);
    }
    @Test
    public void testCustomerWithdraw(){
        James.withdraw(500,new Date(),"Checking");
        assertEquals(500.0,James.getCheckBalance(),0.0);
    }

}


