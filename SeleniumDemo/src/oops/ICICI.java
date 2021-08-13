package oops;

public class ICICI implements RBI, Bank {

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.minBal();
		ic.accountType();
		ic.minWithDrawl();
		ic.maxWithDrawl();
		ic.loans();
		ic.KYC();
		ic.minCustomers();
		RBI.jointAccount();
		ic.bankID();
		ic.bankAddress();
		ic.branchID();

	}

	@Override
	public void minBal() {
		System.out.println("Minimum balance is 1000");
		
	}


	@Override
	public void accountType() {
		System.out.println("Account type allowed are savings and current");
		
	}

	@Override
	public void minWithDrawl() {
		System.out.println("Minimum withdrawl is 100");
		
	}

	@Override
	public void maxWithDrawl() {
		System.out.println("Minimum withdrawl is 50000");
		
	}

	@Override
	public void loans() {
		System.out.println("Study, Personal, House and Mortgage loans facility is available");
		
	}

	@Override
	public void KYC() {
		System.out.println("KYC is mandatory for all types of customers and loans");
		
	}

	@Override
	public void bankID() {
		System.out.println("Bank ID is ICICI");
		
	}

	@Override
	public void branchID() {
		System.out.println("Branch ID is ICIC001");
		
	}

	@Override
	public void bankAddress() {
		System.out.println("Bank address is Navi Mumbai, 500505");
		
	}

}
