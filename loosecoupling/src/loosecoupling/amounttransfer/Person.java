package loosecoupling.amounttransfer;

import java.util.Scanner;

public class Person {
	PaymentGateway paymentGateway;

	Person(PaymentGateway paymentGateway){
		this.paymentGateway=paymentGateway;
	}

	public static void main(String[] args) {


		while(true){
			System.out.println("\n\nWelcome to the PaymentGateway.\n");
			Scanner ip = new Scanner(System.in);
			System.out.print("Choose the option:\n1. GooglePay\n2. PhonePay\n0. Exit\nchoice : ");
			
				
			int choice=ip.nextInt();
			if(choice==0){
				System.out.println("Your exited from the PaymentGateway. Thank you");
				break;
			}
			Person person = null;
			if(choice==1)
				person=new Person(new GooglePay());
			if(choice==2)
				person=new Person(new GooglePay());

			if(person!=null)
				person.paymentGateway.sendMoney();
			else
				System.out.println("Enter either 1 or 2.");
		}

	}

}












