import java.util.Random;
public class insertionSort 
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		//Random Variable is declared
		Random r = new Random();
		//Put these random numbers into an array
		for(int i = 0; i<arr.length;i++)
		{
		arr[i] = r.nextInt(100);
	}
		//print the unsorted array
		System.out.println("UnSorted Array is:");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		//sort the array using insertion sort
		InsertionSort(arr);
		
		//print the sorted array based on insertionSort function
		System.out.println("\nSorted Array is:");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		long startTime = System.nanoTime();
		InsertionSort(arr);
		long endTime = System.nanoTime();
		System.out.println();
		//Print Insertion Sort runtime in Nanoseconds
		System.out.println("Insertion Sort runtime:" + (endTime - startTime)+" nanoseconds");
}
	public static void InsertionSort(int[] arr)
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			int key = arr[i];
			//move elements of array[0...i-1], that are greater than key, to one position ahead of their current position
			int j = i - 1;
			while(j >= 0 && key < arr[j])
				{
				arr[j + 1] = arr[j];
				j--;
				}
			arr[j + 1 ] = key;	
		}
	}
}
