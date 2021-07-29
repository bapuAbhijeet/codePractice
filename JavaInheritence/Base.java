
public class Base {
	 protected void display()
	 {
		 System.out.println("Base");
		 System.out.println(this.toString());
		isTestPrint();
		 
	 }
	 private void isTestPrint() {
		 System.out.println("Base TestPrint");
		
	}
	protected void displayTest()
	 {
		 System.out.println("BaseTest");
	 }
}
