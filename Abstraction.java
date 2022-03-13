public abstract class abs_Demo {

	public static void demo()
	{
		System.out.println("This is from demo method");
	}
	public abstract void demo1();
	
}

class abs1 extends abs_Demo {

	public static void main(String[] args) {
		
		abs1 obj=new abs1();
		obj.demo1();
		obj.demo();
	}

	@Override
	public void demo1() {
		System.out.println("This is from abstract method");
	}
}
