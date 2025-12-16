//Payment Processing System (Abstraction Mini Project)

abstract class Payment {
	abstract void processPayment(double amount);
}

class CardPayment extends Payment{
	@Override
	void processPayment(double amount){
		System.out.println("Processing Card Payment of :" + amount);
        System.out.println("Card Payment Successful!");
	}
}

class UpiPayment extends Payment{
	@Override
	void processPayment(double amount){
	System.out.println("Processing UPI Payment of :" + amount);
    System.out.println("UPI Payment Successful!");	
	}
}

class WalletPayment extends Payment{
	@Override
	void processPayment(double amount){
	System.out.println("Processing Wallet Payment of :" + amount);
    System.out.println("Wallet Payment Successful!");
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		Payment p;

        p = new CardPayment();
        p.processPayment(500);

        System.out.println("-------------------------");

        p = new UpiPayment();
        p.processPayment(250);

        System.out.println("-------------------------");

        p = new WalletPayment();
        p.processPayment(1000);
	}

}