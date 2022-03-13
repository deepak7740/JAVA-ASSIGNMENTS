import java.util.Scanner;
public class Method_over
 {
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no");
		int n1,n2,t=0,n3,n4,n5;
		n1=sc.nextInt();
		n2=sc.nextInt();
		swap(n1,n2);
		
		System.out.println("Enter two no");
		n1=sc.nextInt();
		n2=sc.nextInt();
		swap(n1,n2,t);
		
		System.out.println("Enter three no");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		grt(n1,n2,n3,t);
		
		System.out.println("Enter five no");
		n1=sc.nextInt();
		n2=sc.nextInt();	
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		grt(n1,n2,n3,n4,n5);
	}
	
	
	//method 1 for swap 2 var without t 
	public static void swap(int n1,int n2)
	{
 System.out.println("before swapping numbers: "+n1 +" "+ n2);  
       
        n1 = n1+ n2;   
        n2 = n1 - n2;   
        n1 = n1-n2;   
        System.out.println("After swapping: "+n1 +"  " + n2);
	}
	
    // method 2 for swap 2 var with t	
	public static void swap(int n1,int n2,int t)
	{
	
		   System.out.println("before swapping numbers: "+n1+"  "+ n2);  
      
       t = n1;  
      n1 = n2;  
       n2=t;  
       System.out.println("After swapping: "+n1+"   " + n2);  
       System.out.println( );  
	}

  // method 3 for grt of 3 num
  public static void grt(int n1,int n2,int n3,int t)
  {
  	int ans;
  	t =n1>n2 ? n1:n2;  
      ans =n3>t ? n3:t;    
System.out.println("The greatest num is: "+ans);  	
  }
 
  
   //method 4 for grt of 5 num
   public static void grt(int n1,int n2,int n3,int n4,int n5)
   {
 
  		int[] a = new int[] { n1,n2,n3,n4,n5};
		int max = a[0];
	for(int i = 1; i < a.length;i++)
		 {
		 		 if(a[i] > max)
				{
					max = a[i];
				}
		}

  /*	System.out.println("The nums are : ");
	for(int i = 0; i < a.length;i++)
		{
		System.out.print(a[i]);
	}
	*/
	System.out.println("The greatest num is:" + max);
	}	
 }
 
