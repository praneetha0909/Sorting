import java.util.Random;
public class HeapSort 
{
	public static void main(String[] args)
	{
	int arr[] = new int[10];
	//Random Variable is to be declared 
	Random r = new Random();
	//Put these random numbers into an array
	for(int i = 0; i<arr.length;i++)
	{
		arr[i] = r.nextInt(100);
	}
	//unsorted array is printed
	System.out.println("UnSorted Array is:");
	for(int i = 0; i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	//sort the array using heap sort
	heapSort(arr);
	
	//print the sorted array based on heapSort function
	System.out.println("\nSorted Array is:");
	for(int i = 0; i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	long startTime = System.nanoTime();
			heapSort(arr);
	long endTime = System.nanoTime();
	System.out.println();
	//Print runtime of heapsort in nanoseconds
	System.out.println("Heap Sort runtime:" + (endTime - startTime) + " nanoseconds");
}
	public static void heapSort(int[] arr)
	{
		int n = arr.length;
		//build heap
		for(int i = n / 2 - 1;i >= 0;i--)
			heapify(arr,n,i);
			//Element is extracted one by one
			for(int i = n - 1;i >= 0;i--)
			{
			//move current root to end
			int swap = arr[0];
			arr[0] = arr[i];
			arr[i] = swap;
			//Run max heapify
			heapify(arr,i,0);
		}
	}
	public static void heapify(int[] arr,int n,int i)
	{
		//initialize largest as root
		int largest = i; 
		int leftchild = 2*i+1;
		int rightchild = 2*i+2;
		//When the left child is bigger than the largest element at the moment
		if(leftchild < n && arr[leftchild] > arr[largest])
		{
			largest = leftchild;
		}
		//When the right child is bigger than the largest element at the moment
		if(rightchild < n && arr[rightchild] > arr[largest])
		{
			largest = rightchild;
		}
		//if the root is not the greatest element
		if(largest != i)
		{
			int temporary = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temporary;
			//Perform heapify operation recursively on the relevant subtree.
			heapify(arr,n,largest);
		}
	}
}
