import java.util.*;
public interface Payment {

	void pay(double amount);

}

CreditCard.java
public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		amount -= amount * 3 / 100;// 3% discount
		System.out.println("Payable amount using Credit Card: Rs. " + amount);
	}

}

Paypal.java
public class PayPalPayment implements Payment {

	@Override
	public void pay(double amount) {
		amount += amount * 4.5 / 100;// PayPal charge
		System.out.println("Payable amount using Debit Card through paypal: Rs. " + amount);
	}

}

Bitcoin.java
public class BitcoinPayment implements Payment {

	@Override
	public void pay(double amount) {
		amount -= amount * 2.5 / 100;// Bitcoin discount  1 bitcoin = Rs 1000000 (approx)
		System.out.println("Payable amount using Bitcoin :  " + (amount/1000000) +"bitcoin(s)");
	}

}

PaymentStratergy.java
public class PaymentStrategy {

	private Payment payment;

	public PaymentStrategy(Payment payment) {
		this.payment = payment;
	}

	public Payment getPayment() {
		return payment;
	}

	public void payAmount(double amount) {
		payment.pay(amount);
	}

}

StrategyPatternTest.java
public class StrategyPatternTest {

	public static void main(String[] args) {
		double price = 34560;// goods price in Rs

		Payment creditCardPayment = new CreditCardPayment();
		Payment bitcoinPayment = new BitcoinPayment();
		Payment payPalPayment = new PayPalPayment();

		PaymentStrategy paymentStrategy = new PaymentStrategy(creditCardPayment);
		paymentStrategy.payAmount(price);

		paymentStrategy = new PaymentStrategy(bitcoinCardPayment);
		paymentStrategy.payAmount(price);

		paymentStrategy = new PaymentStrategy(payPalPayment);
		paymentStrategy.payAmount(price);
	}

}