import java.util.Random;
public class BubbleSort
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		//Random Variable is to be declared
		Random r = new Random();
		//Put these Random numbers into an array
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = r.nextInt(100);
		}
		//Print the unsoredt array from the array with generated random numbers
		System.out.println("Unsorted Array is:");
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		//sort the array using bubble sort
		bubbleSort(arr);
		
		//Sorted array is printed using Bubble Sort function
		System.out.println("\nSorted Array is:");
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		long startTime = System.nanoTime();
				bubbleSort(arr);
		long endTime = System.nanoTime();
		System.out.println();
		//Runtime of bubble sort is printed in Nanoseconds
		System.out.println("Bubble Sort runtime:" + (endTime - startTime)+" nanoseconds");
}
	public static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		for(int i = 0;i<n-1;i++)
		{
			for(int j = 0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					//swap array[j] and array[j+1]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}