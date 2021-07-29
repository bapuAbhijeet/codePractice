
public class CallingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Impl impl = new Impl();
		Base base = new Impl(); // UPcasting
		Phd phd = new Phd();
		
			
		
		Base base1 = new Impl(); //upcasting
		Impl impl1 = (Impl) base1; //downcasting
		
		
		//phd.display();
		base.display();
		//impl.display();
	}

}
