import java.util.Scanner;

public class GreatestNo {

	public GreatestNo() {
  int a,b,c;
	Scanner sc=new Scanner(System.in);
  System.out.print("Enter Three Number");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
    
  if(a>b && a>c) {
	  System.out.print( a + "" + "" +"number is Greater");
  }else if(b>c && b>a) {
	  System.out.print( b + "" + "" +"is Greater number");
  }else {
	  System.out.println( c + "" +"" +"is Greater number");
  }
	}

	public static void main(String[] args) {
		GreatestNo obj=new GreatestNo();
	}
}
