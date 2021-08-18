package access.modifiers.outside;

import com.access.modifiers.ProtectedTest;

public class ProtectedOutsidePkg extends ProtectedTest{

	public static void main(String[] args) {
		/*ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.accessSite();
		pt.verifyLogin();*/
		
		ProtectedOutsidePkg pop = new ProtectedOutsidePkg();
		System.out.println(pop.URL);
		System.out.println(pop.USERNAME);
		System.out.println(pop.PASSWORD);
		pop.accessSite();
		pop.verifyLogin();

	}

}
