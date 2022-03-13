import java.util.Scanner;

 interface Inf_demo {
	public void demo();
}

public class inf_demo1 implements Inf_demo {

	public static void main(String[] args) {
		inf_demo1 obj=new inf_demo1();
		hi();
		obj.demo();
		
	}
	public static void hi()
	{
		System.out.println("hiiii");
	}
	@Override
	public void demo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int s=0,r;
		while(num>0)
		{
			r=num%10;
			s=s+r;
			num=num/10;
		}
		System.out.println("The sum of digit is ="+s);
	}
}
