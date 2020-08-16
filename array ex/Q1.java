import java.util.Scanner;

public class Q1
{
	static void diff(int[] arr)
	{
		int lar=arr[0];
		int small=arr[0];

		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]< small)
			{
				small= arr[i];
			}
			if(arr[i]> lar)
			{
				lar= arr[i];
			}
		}
		System.out.println("shortest"+ small);
		System.out.println("longtest"+ lar);
		}
	


	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);

		System.out.println("enter the size of array");
		int size = inn.nextInt();
		int[] arr = new int[size];

		System.out.println("enter the no. of elements u want to insert");
		int count =inn.nextInt();

		System.out.println("enter elements inside array");
		for (int i=0;i< count ;i++ ) {
			arr[i] = inn.nextInt();
		}
		System.out.println();
		diff(arr);
}
}