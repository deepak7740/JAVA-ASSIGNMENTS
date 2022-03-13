import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	int a[]=new int [5];
	int min,i;
		
  Scanner sc=new Scanner(System.in);
	System.out.print("Enter Array Element");
	for(i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
    
	min=a[0];
	for(i=1;i<a.length;i++) {
		if(a[i]<min){
			min=a[i];
		}
	}
	System.out.println("Smallest Element Is = " +min);
	}
	}
