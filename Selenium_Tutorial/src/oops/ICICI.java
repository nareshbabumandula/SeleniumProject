package oops;

public class ICICI implements RBI{

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.minDeposit();
		ic.maxDeposit();
		ic.KYC();
		ic.ATM();
		ic.AccountTypes();
		ic.AML();
		ic.creditCard();
		ic.Loans();
		RBI.demat();
		System.out.println(ic.accountNo);
		System.out.println(balance);
	}

	@Override
	public void minDeposit() {
		// implementation or logic or code
		System.out.println("minDeposit is 500 rupees only..!");
	}

	@Override
	public void minWithDrawl() {
		System.out.println("Minimum withdrawl is 100 rupees..!");
		
	}

	@Override
	public void Loans() {
		System.out.println("Personal, Commercial, House loan facility is available..!");
		
	}

	@Override
	public void AccountTypes() {
		System.out.println("Savings, Current and Demat account types are available..!");
		
	}

	@Override
	public void creditCard() {
		System.out.println("Card card facility is availble..!");
		
	}

	@Override
	public void ATM() {
		System.out.println("Atm's are available");
		
	}

	@Override
	public void AML() {
		System.out.println("AML is being considered..!");
		
	}

	@Override
	public void KYC() {
		System.out.println("KYC is done before account opening..!");
		
	}

}
