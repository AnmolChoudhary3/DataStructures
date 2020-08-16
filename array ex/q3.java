import java.util.Scanner;

class q3
{

	static void sum(int[] arr)
	{
		int sum =0;
		for(int i=0;i<5;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("sum: " + sum);
	}


	static void alt(int[] arr)
	{
		int sum =0;
		for(int i=0;i<5;i+=2)
		{
			sum = sum + arr[i];
		}
		System.out.println("sum of alternate elements: " + sum);
	}

	static void sec(int[] arr)
	{
		int fir=arr[0];
		int sec=arr[0];

		for(int i=0; i<5;i++)
		{
			if(arr[i]>fir)
			{
				sec=fir;
				fir=arr[i];
			}
			if(arr[i]<fir && arr[i]>sec)
			{
				sec=arr[i];
			}
		}
		System.out.println("second largest no: " + sec );
	}


	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);

		
		int[] arr = new int[5];

		

		System.out.println("enter 5 elements inside array");
		for (int i=0;i< 5 ;i++ ) {
			arr[i] = inn.nextInt();
		}
		System.out.println();

		System.out.println("enter your choice of operation:");
		System.out.println("1: sum of all the element ");
		System.out.println("2: Sum of alternate elements in the array");
		System.out.println("3: Second highest element in the array" );
		int ch = inn.nextInt();

		switch(ch)
		{
			case 1: sum(arr);break;
			case 2: alt(arr);break;
			case 3: sec(arr);break;
			default: System.out.println("wrong choice");
		}

		//sum(arr)
		//alt(arr)
		//sec(arr)
}
}