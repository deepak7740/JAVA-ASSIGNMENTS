import java.util.Scanner;

public class Method_over {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no");
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		sum(n1,n2);
		System.out.println("Enter three no");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		sum(n1,n2,n3);
	}
	public static void sum(int n1,int n2)
	{
		System.out.println("The add is ="+ (n1+n2));
	}
	public static void sum(int n1,int n2,int n3)
	{
		System.out.println("The add is ="+ (n1+n2+n3));
	}
}
