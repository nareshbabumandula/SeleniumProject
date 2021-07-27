package oops;

public class EncapsulationTest extends EncapsulationExample{

	public static void main(String[] args) {
		
		EncapsulationTest et = new EncapsulationTest();
		et.setUSERNAME("Rav");
		System.out.println(et.getUSERNAME());
		et.setPASSWORD("Demo");
		System.out.println(et.getPASSWORD());
	}

}
