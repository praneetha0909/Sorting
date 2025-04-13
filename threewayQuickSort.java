import java.util.Random;
public class threewayQuickSort 
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
		QuickSort(arr, 0, arr.length-1);
		
		//print the sorted array based on QuickSort function
		System.out.println("\nSorted Array is:");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		long startTime = System.nanoTime();
		QuickSort(arr,0,arr.length-1);
		long endTime = System.nanoTime();
		System.out.println();
		//Print Three way Quick Sort runtime in Nanoseconds
		System.out.println("Three way Quick Sort runtime:" + (endTime - startTime)+" nanoseconds");
}
	public static void QuickSort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int[] pivot = partitions(arr,low,high);
				QuickSort(arr,low,pivot[0] - 1);
				QuickSort(arr,pivot[1]+1,high);
		}
	}
	public static int[] partitions(int[] arr,int low,int high)
	{
		//partitioning array into three parts
		//Element < pivot
		//Element = Pivot
		//Element > pivot
		Random random = new Random();
		//choose a Random pivot index
		int pivotIndex = random.nextInt(high - low +1)+low;
		int pivot = arr[pivotIndex];
		int lessthan = low;
		int greaterthan = high;
		int i = low;
		while (i <= greaterthan)
		{
			if(arr[i] < pivot)
			{
				swap(arr,lessthan++,i++);
			}
			else if(arr[i] > pivot)
			{
				swap(arr,i,greaterthan--);
			}
			else
			{
				i++;
			}
		}
		return new int[] {lessthan,greaterthan};
	}
	private static void swap(int[] arr, int i, int j) 
	{
		int temporary = arr[i];
		arr[i] = arr[j];
		arr[j] = temporary;
	}
}
