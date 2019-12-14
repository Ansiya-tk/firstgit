
public class AxisBank extends BankInfo {
//	public void deposit(int b)
//	{
//		System.out.println("This is child class");
//	}
   
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit(3);
		ab.savings();
		ab.fixed();
	}

	@Override
	public void deposit(int g) {
		// TODO Auto-generated method stub
		
		System.out.println("From child class");
		
		System.out.println("java");
		System.out.println("selenium");
	}
}
