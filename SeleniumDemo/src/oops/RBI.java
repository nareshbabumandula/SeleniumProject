package oops;

public interface RBI {
		
	abstract void minBal();
	abstract void accountType();
	abstract void minWithDrawl();
	abstract void maxWithDrawl();
	abstract void loans();
	abstract void KYC();
	
	default void minCustomers() {
		System.out.println("Minimum no of customers should be 1000");
	}
	
	static void jointAccount() {
		System.out.println("Joint account facility should be available");
	}
	
	public static void main(String[] args) {
		//RBI r = new rb
		jointAccount();
	}
	

}
