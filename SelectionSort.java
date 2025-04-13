import java.util.Random;
public class SelectionSort 
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		//Random Variable is to be declared
		Random r = new Random();
		//put random integers into array
		for(int i = 0; i<arr.length;i++)
		{
		arr[i] = r.nextInt(100);
	}
		//Unsorted array is to be printed
		System.out.println("UnSorted Array is:");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		//sort the array using selection sort
		selectionSort(arr);
		
		//print the sorted array based on selectionSort function
		System.out.println("\nSorted Array is:");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		long startTime = System.nanoTime();
		selectionSort(arr);
		long endTime = System.nanoTime();
		System.out.println();
		//Print Selection sort runtime in Nanoseconds
		System.out.println("Selection Sort runtime:" + (endTime - startTime)+" nanoseconds");
}
	public static void selectionSort(int[] arr)
	{
		int n = arr.length;
		for(int i = 0;i < n-1; i++)
		{
			//set current element as minimum element
			int min = i;
			//check the element to be minimum
			for(int j = i+1; j < n; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
					int temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
	}
}
