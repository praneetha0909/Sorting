import java.util.Random;
public class QuickSort 
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		//Random variable is to be declared
		Random r = new Random();
		//put random integers into array
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
		//sort the array using Quick sort
		quickSort(arr, 0, arr.length-1);
		
		//print the sorted array based on QuickSort function
		System.out.println("\nSorted Array is:");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		long startTime = System.nanoTime();
		quickSort(arr,0,arr.length-1);
		long endTime = System.nanoTime();
		System.out.println();
		//Print QuickSort runtime in Nanoseconds
		System.out.println("Quick Sort runtime:" + (endTime - startTime)+" nanoseconds");
}
	public static void quickSort(int[] arr, int low, int high)
	{
		//low --> Starting index, high --> ending index 
		if(low < high)
		{
			//pi --> partitioning index, arr[pi] is now at the right place
			int pi = partition(arr,low,high);
			//Before pi
			quickSort(arr,low,pi-1);
			//After pi
			quickSort(arr,pi+1,high);
		}
	}
	public static int partition(int[] arr, int low, int high)
	{
		//pivot -->element should be placed at right position
		int pivot = arr[high];
		//index of smaller element
		int i = low - 1;
		for(int j = low; j < high; j++)
		{
			//if current element is smaller than the pivot
			if(arr[j] <= pivot)
			{
				//increment index of smaller element
				i++;
				int temp1 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp1;
			}
		}
		int temp2 = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp2;
		return i+1;
	}
}
