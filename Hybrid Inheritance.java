import java.util.*;

public class demo_a {
	int size,i;
	public int[] accept()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter "+size+" numbers :");
		
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}


// ascending order
public class demo_b extends demo_a 
{
	public void arrASC()
	{
		System.out.println("\nArray in Ascending Order:");
		int j,temp;
		int[]arr=accept();
		System.out.println("\nThe no are :");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nAscending Order :");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}


//grt num
public class demo_c extends demo_b {



	public static void main(String[] args) {

		demo_c obj=new demo_c();

		obj.arrASC();

		obj.grt();

demo_d obj1=new demo_d();

		obj1.sod();

		

	}



	public void grt()

	{

		System.out.println("GRT of 3 No");

		int[]arr=accept();

		System.out.println("The no are :");

		for(i=0;i<size;i++)

		{

			System.out.print(arr[i]+"\t");

		}

		System.out.println("process of GRT ");

		if(arr[0]>arr[1]&&arr[0]>arr[2])

				System.out.println(arr[0]+" is greater");

				else if(arr[1]>arr[0]&&arr[1]>arr[2])

					System.out.println(arr[1]+" is greater");

				else

					System.out.println(arr[2]+" is gerater");
}
	}
	
	

	

	

	

	

	

	

	

	
// sum of digit 
		
void sod()

		{

			int digit,sum=0;

			System.out.println("SOD of No");

			int[]arr=accept();

			System.out.println("The no are :");

			for(i=0;i<size;i++)

			{

				System.out.print(arr[i]+"\t");

			}

			System.out.println("process of SOD ");

			while(arr[0]>0)

			{

				digit=arr[0]%10;

				sum=sum+digit;

				arr[0]=arr[0]/10;

			}

			System.out.println("SOD is "+sum);

		}



}

	
