//Bank Account Data Protection System

class Account{
	private String accountHolderName;
    private String accountNumber;
    private double balance;
    private String accountType;
    private String IFSC;
    private String branchName;
    private String mobileNumber;
    private String email;
    private String password; 
    private int pin; 

    public String getaccountHolderName(){
    	return accountHolderName;
    }

    public String getaccountNumber(){
    	return accountNumber;
    }

    public double getBalance(){
    	return balance;
    }

    public String getaccountType(){
    	return accountType;
    }

    public String getIFSC(){
    	return IFSC;
    }
 
    public String getbranchName(){
    	return branchName;
    }

    public String getmobileNumber(){
    	return mobileNumber;
    }

    public String getEmail(){
    	return email;
    }

    public String getPassword(){
    	return password;
    }

    public int getPin(){
    	return pin;
    }

    public void setaccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public void setaccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setaccountType(String accountType){
        this.accountType = accountType;
    }

    public void setbranchName(String branchName){
        this.branchName = branchName;
    }

    public void setIFSC(String IFSC){
        this.IFSC = IFSC;
    }

    public void setmobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

     public void setPassword(String password){
        this.password = password;
    }
    
     public void setEmail(String email){
        this.email = email;
    }

     public void setPin(int pin){
        this.pin = pin;
    }


}

public class BankAccount{
	public static void main(String[] args) {

		Account a1 = new Account();
		a1.setaccountHolderName("Priyanka");
		a1.setaccountNumber("1234");
		a1.setBalance(1232);
		a1.setaccountType("Saving");
		a1.setbranchName("Patas");
		a1.setIFSC("436356");
		a1.setmobileNumber("235262829");
		a1.setEmail("rodepriyanka099@gmail.com");
		a1.setPassword("123456");
		a1.setPin(123456);

		System.out.println("Account Holder is : "+a1.getaccountHolderName());
		System.out.println("Account Number is : "+a1.getaccountNumber());
		System.out.println("Account balance is : "+a1.getBalance());
		System.out.println("Account type is : "+a1.getaccountType());
		System.out.println("Branch name is : "+a1.getbranchName());
		System.out.println("IFSC Code is : "+a1.getIFSC());
		System.out.println("Mobile Number is : "+a1.getmobileNumber());
		System.out.println("email is : "+a1.getEmail());
		System.out.println("Password is : "+a1.getPassword());
		System.out.println("Pin is : "+a1.getPin());
		
	}
}