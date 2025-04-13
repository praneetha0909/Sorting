import java.util.Random;
public class SortingAlgoComparision 
{
public static void main(String[] args)
{
	//Different Input Sizes
	int[] inputsizes = {1000,2000,3000,4000,5000};
	//Bubble Sort running time
	long[] bsTimes = new long[inputsizes.length];
	//Merge Sort running time
	long[] mSortTimes = new long[inputsizes.length];
	//Quick Sort running time
	long[] qsTimes = new long[inputsizes.length];
	//Heap Sort running time
	long[] hsTimes = new long[inputsizes.length];
	//Insertion Sort running time
	long[] isTimes = new long[inputsizes.length];
	//Selection Sort running time
	long[] ssTimes = new long[inputsizes.length];
	//Three way quick sort
	long[] threeqsTimes = new long[inputsizes.length];
	for(int i = 0;i<inputsizes.length;i++)
	{
		//generate Random array for the given input size
		int[] arr = generateRandomArray(inputsizes[i]);
		//Bubble Sort
		long startTime = System.nanoTime();
		bs(arr); //Perform Bubble Sort
		long endTime = System.nanoTime();
		//System.out.println();
		//Print runtime in Nanoseconds
		bsTimes[i] = endTime - startTime;
		
		//Merge Sort
		arr = generateRandomArray(inputsizes[i]);
		startTime = System.nanoTime();
		mSort(arr,0,arr.length-1); //Perform Merge Sort
		endTime = System.nanoTime();
		//Calculate Merge Sort running Time
		mSortTimes[i] = endTime - startTime;
		
		//Quick Sort
		arr = generateRandomArray(inputsizes[i]);
		startTime = System.nanoTime();
		qSort(arr,0,arr.length-1); //Perform Quick Sort
		endTime = System.nanoTime();
		//Calculate quick Sort running Time
		qsTimes[i] = endTime - startTime;
		
		//Heap Sort
		arr = generateRandomArray(inputsizes[i]);
		startTime = System.nanoTime();
		hs(arr); //Perform Heap Sort
		endTime = System.nanoTime();
		//Calculate Heap Sort running Time
		hsTimes[i] = endTime - startTime;
		
		//Insertion sort
		arr = generateRandomArray(inputsizes[i]);
		startTime = System.nanoTime();
		is(arr); //Perform Insertion Sort
		endTime = System.nanoTime();
		//Calculate Insertion Sort running Time
		isTimes[i] = endTime - startTime;
		
		//Selection Sort
		arr = generateRandomArray(inputsizes[i]);
		startTime = System.nanoTime();
		ss(arr); //Perform Selection Sort
		endTime = System.nanoTime();
		//Calculate Selection Sort running Time
		ssTimes[i] = endTime - startTime;
		
		//Three Way Quick Sort
		arr = generateRandomArray(inputsizes[i]);
		startTime = System.nanoTime();
		threeqs(arr,0,arr.length-1); //Perform Three Way Sort
		endTime = System.nanoTime();
		//Calculate Three Way running Time
		threeqsTimes[i] = endTime - startTime;
	}
	System.out.println("Input Size\tBubbleSort\tMergeSort\tQuickSort\tHeapSort\tInsertionSort\tSelectionSort\tThreewayQuickSort");
	for(int i = 0;i<inputsizes.length;i++)
	{
		System.out.println(inputsizes[i] + "\t\t" + bsTimes[i] + "\t\t" + mSortTimes[i] + "\t\t" + qsTimes[i] + "\t\t" + hsTimes[i] + "\t\t" + isTimes[i] + "\t\t" + ssTimes[i] + "\t\t" + threeqsTimes[i]);
	}
}
private static int[] generateRandomArray(int size) 
{
	int[] arr = new int[size];
	for(int i = 0;i<size;i++)
	{
		//Generate random number between 0 and 999
		arr[i] = (int)(Math.random() * 1000);
		
	}
	return arr;
}
public static void bs(int[] arr)
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
public static void mSort(int[] arr,int left,int right)
	{
		if(left<right)
		{
			int mid = (left + right)/2;
			mSort(arr,left,mid); //sort left half
			mSort(arr,mid+1,right); //sort right half
			ms(arr,left,mid,right); //merge the two halves
		}
	}
public static void ms(int[] arr, int left, int mid,int right)
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
public static void qSort(int[] arr, int low, int high)
{
	//low --> Starting index, high --> ending index 
	if(low < high)
	{
		//pi --> partitioning index, arr[pi] is now at the right place
		int pi = part(arr,low,high);
		//Before pi
		qSort(arr,low,pi-1);
		//After pi
		qSort(arr,pi+1,high);
	}
}
public static int part(int[] arr, int low, int high)
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
public static void hs(int[] arr)
{
	int n = arr.length;
	//build heap
	for(int i = n / 2 - 1;i >= 0;i--)
		Heapify(arr,n,i);
		//Extract element one by one
		for(int i = n - 1;i >= 0;i--)
		{
			//move current root to end
		int swap = arr[0];
		arr[0] = arr[i];
		arr[i] = swap;
		//on the trimmed-down heap, run max heapify
		Heapify(arr,i,0);
	}
}
public static void Heapify(int[] arr,int n,int i)
{
	int largest = i; //initialize largest as root
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
		Heapify(arr,n,largest);
	}
}
public static void is(int[] arr)
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
public static void ss(int[] arr)
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
public static void threeqs(int[] arr,int low,int high)
	{
		if(low<high)
		{
			//parts --> Partitioning
			int[] pivot = parts(arr,low,high);
				threeqs(arr,low,pivot[0] - 1);
				threeqs(arr,pivot[1]+1,high);
		}
	}
public static int[] parts(int[] arr,int low,int high)
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


