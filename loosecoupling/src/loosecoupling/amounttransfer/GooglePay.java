package loosecoupling.amounttransfer;

public class GooglePay implements PaymentGateway{
	
	@Override
	public void sendMoney(){
		System.out.println("Amount sent through Google Pay..");
	}

}
