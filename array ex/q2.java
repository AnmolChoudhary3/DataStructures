import java.util.Scanner;

public class q2
{

	static void evenIndex(int[] arr)
	{
		System.out.println("elements on even index:");
		for(int i=0;i<10;i+=2)
		{
			System.out.println(arr[i]);
		}
	}

	static void odd(int[] arr)
	{
		System.out.println("elements which are odd:");
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2!=0) 
			{	
				System.out.println(arr[i]);	
			}
			
		}
	}


	static void revx(int[] arr)
	{
		System.out.println("reverse order");
		for(int i=9;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}


	static void fandl(int[] arr)
	{
		System.out.println("only first and last");
		System.out.println("first:" + arr[0] + "last:"+ arr[arr.length-1]);
	}




	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);

		
		int[] arr = new int[10];

		

		System.out.println("enter 10 elements inside array");
		for (int i=0;i< 10 ;i++ ) {
			arr[i] = inn.nextInt();
		}
		System.out.println();

		evenIndex(arr);
		odd(arr);
		revx(arr);
		fandl(arr);
	
}
}