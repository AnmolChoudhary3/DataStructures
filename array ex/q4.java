import java.util.Scanner;

public class q4
{

	static void freq(int[] arr, int no )
	{
		int index=0;
		for(int check: arr)
		{
			

			if(check == no)
			{
				index++;
			}
			
		}
		System.out.println("frequency of '"+ no +"' element: " + index);
	}


	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);

		System.out.println("enter the size of array");
		int size = inn.nextInt();
		int[] arr = new int[size];

		
		System.out.println("enter elements inside array");
		for (int i=0;i< size ;i++ ) {
			arr[i] = inn.nextInt();
		}
		
		System.out.println("enter the element whose frequency u want to check");
		int no =inn.nextInt();



		freq( arr, no );

}
}