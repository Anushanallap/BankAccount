package Accountbalance;

public class Accountmainblnc extends Account {
	
	 public void credit(double creditamount){
		 
	        double previousamount = super.getAcc_bal();
	        double new_amt =previousamount + creditamount;
	        super.setAcc_bal(new_amt);
	        //System.out.println(super.setAcc_bal()); //super.getAcc_bal();
	    }
	    public void debit(double debitamt){  
	        // compare the amount present in the account with the amount to be debited
	        if (super.getAcc_bal() >= debitamt){
	            double remainingamt = super.getAcc_bal() - debitamt;
	            super.setAcc_bal(remainingamt); 
	            System.out.println("The new balance = "+super.getAcc_bal());
	        } else if (super.getAcc_bal() < debitamt){
	            System.out.println("Debit amount exceeded account balance!");
	        }
	         //super.getAcc_bal();
	    }
	   
	    public static void main(String []args){
	       Account acc = new Account();
	       acc.credit(2000);
	       acc.debit(1000);
	   } 
	

}
