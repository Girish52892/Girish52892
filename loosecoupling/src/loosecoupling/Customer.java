package loosecoupling;

public class Customer {
	
	//Ola o; Uber u; (tight coupling) 
	
	static Cab c;  //upcasting and generelisation
	
	//String customerName;
	
	
	public void setCab(Cab c){
		this.c=c;
	}
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCab(new Ola());
		c.bookRide();
		c.cancellRide();
	}
}
