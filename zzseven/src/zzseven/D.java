package zzseven;

public class D implements B, C {
	public void methodA() {
		System.out.println("MethodA");
	}
	public void methodC() {
		System.out.println("MethodC");
		
	}
	public void methodB() {
		System.out.println("MethodB");
	}
	public static void main(String args[])
	{
		D obj = new D();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}

}
