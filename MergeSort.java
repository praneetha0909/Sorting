import java.util.Random;
public class MergeSort 
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		//Random variable is declared
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
		//sort the array using Merge sort
		mergeSort(arr,0,arr.length-1);
		
		//print the sorted array based on mergeSort function
		System.out.println("\nSorted Array is:");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		long startTime = System.nanoTime();
		mergeSort(arr,0,arr.length-1);
		long endTime = System.nanoTime();
		System.out.println();
		//Print Merge Sort runtime in Nanoseconds
		System.out.println("Merge Sort runtime:" + (endTime - startTime)+" nanoseconds");
	}
	public static void mergeSort(int[] arr,int left,int right)
	{
		if(left<right)
		{
			int mid = (left + right)/2;
			mergeSort(arr,left,mid); //sort left half
			mergeSort(arr,mid+1,right); //sort right half
			merge(arr,left,mid,right); //merge the two halves
		}
	}
	public static void merge(int[] arr, int left, int mid,int right)
	{
		//Create Temporary sub arrays
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		//copy sub arrays into temporaries
		for(int i = 0;i < n1;i++)
			leftArr[i] = arr[left + i];
		for(int j = 0;j< n2;j++)
			rightArr[j] = arr[mid + j + 1];
		int i = 0;int j = 0; int k = left;
		while(i<n1 && j<n2)
		{
			if(leftArr[i] <= rightArr[j])
			{
				arr[k] = leftArr[i];
				i++;
			}
			else
			{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < n1)
		{
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < n2)
		{
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
}
	