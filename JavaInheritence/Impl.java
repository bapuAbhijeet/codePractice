
public class Impl extends Phd{
 @Override
protected void display() {

	 System.out.println("Inside Impl Display before call supre");
	super.display();
	System.out.println("Inside Impl Display after call supre");
}
/*@Override
 protected void isTestPrint() {
	 System.out.println("Impl TestPrint");
	
}*/
 @Override
	protected void displayTest() {
	 System.out.println("Inside Impl DisplayTest");
	}
}
