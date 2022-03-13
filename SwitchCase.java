import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice :\n1:pin\n2:cash\n3:sta\n4:with");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1 :
			System.out.println("do the process of pin");
		break;
		case 2 :
			System.out.println("do the process of cash");
		break;
		case 3 :
			System.out.println("do the process of statement");
		break;
		case 4 :
			System.out.println("do the process  of statement");
		break;
		default :
			System.out.println("please enter the valid choice");
			
		}
	}

}
