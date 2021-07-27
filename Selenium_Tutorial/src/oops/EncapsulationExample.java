package oops;

/*
 * Encapsulation: It is a process of wrapping code and data together into a single unit.
 * To achieve encapsulation the data members of the class must be private
*/
	
public class EncapsulationExample {
	
	private String USERNAME = "naresh";
	private String PASSWORD = "Secure*1234";
		
	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		if (uSERNAME.length()>=4) {
			USERNAME = uSERNAME;
		}
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}



	public static void main(String[] args) {
		

	}

}
