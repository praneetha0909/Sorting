***Project Title***
-----------------------------
SORTING ALGORITHMS
------------------------------

***INTRODUCTION***

The Eclipse Integrated Development Environment (IDE) was used to implement a set of well-known sorting algorithms in Java for 
this project. It offers examples of Mergesort, Heapsort, Quicksort (with standard and three-median partitioning), Insertion sort, 
Selection sort, and Bubble sort. 
For reference reasons, the project seeks to offer a thorough and well-documented collection of sorting algorithms with includes 
running time of the sorting algorithms along with various input sizes.
## BubbleSort 
The basic comparison-based sorting method known as "Bubble Sort" compares nearby elements in an array repeatedly and swaps them if they are in the wrong order, continuing until the entire array is sorted.
## HeapSort 
Heapsort is a comparison-based sorting algorithm that arranges elements in a binary heap data structure.
## InsertionSort 
Insertion Sort is a straightforward comparison-based sorting algorithm that continually chooses one element from the array's unsorted portion and inserts it into the proper location in the sorted portion.
## MergeSort
Mergesort is a divide-and-conquer algorithm that divides an array recursively, sorts each half independently,and then merges the two halves back together.
## Quick Sort
A pivot element is used to partition the array in the quicksort method, which then recursively sorts the sub-arrays on both sides of the pivot.
## Selection Sort 
Selection Sort is a basic comparison-based sorting algorithm that repeatedly moves the smallest (or largest) element from the array's unsorted portion to the start (or end) of the sorted portion.
## Threeway QuickSort 
The Quicksort algorithm can be modified to use three partitions rather than two, which improves speed for arrays with a lot of duplicate entries.

***MOTIVATION***

This project's goal is to offer a thorough and well-organized collection of sorting algorithms that have been implemented in Java 
using Eclipse. It intends to provide a ready-to-use codebase for sorting arrays and assist programmers in learning and comprehending 
various sorting algorithms and their Java implementations using the Eclipse IDE.

***BUILD STATUS***

1. BubbleSort: Stable
2. HeapSort: Stable
3. insertionSort: Stable
4. MergeSort: Stable
5. QuickSort: Stable
6. SelectionSort: Stable
7. threewayQuickSort: Stable
8. SortingAlgoComparision: Stable

***CODE STYLE***

To maintain uniformity and readability, this project adheres to the accepted Java code style standards. The codebase uses proper 
formatting, indentation, and naming rules.

***TECHNOLOGY/FRAMEWORK:

No external frameworks or libraries are used; this project is implemented in Java using the Eclipse IDE.

***FEATURES***

Implementation of several well-known sorting algorithms, including Bubble, Selection, Insertion, Merge, Quick, and Heap sorts.
Sorting algorithms are implemented to sort elements based on random generator.
Code that is easy to understand and is properly documented, with comments that outline the reasoning behind each sorting algorithm's 
steps.

***EXAMPLE TO A CODE***

Here is an example using Eclipse showing how to sort an array of numbers in ascending order using the Bubble Sort implementation 
from this project:

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
	
***INSTALLATION***

Since it is a Java codebase, this project may be directly integrated into any Java project made in Eclipse without the need for 
installation. Simply add the appropriate sorting algorithm implementations to your Java project in Eclipse and utilize them as necessary.

***HOW TO USE***

1. Launch Eclipse and start a fresh Java project.
2. Make a new Java class in the project and give it the name "Main" or another suitable name.
3. In the "Main" class, import the project's Bubble Sort implementation.
4. Write code to construct an array of integers and sort the array by invoking the bubbleSort() method of the Bubble Sort implementation.
5. To view the sorted output, run the "Main" class.

(OR)

1. 'bubbleSort.java' should be included in your Java project.
2. Call the 'bubbleSort(int[] arr)' function with the parameter of the array you wish to sort.
3. The 'bubbleSort' method will continually check nearby elements in the array and swap them if they are out of order, 
until the array is sorted.
4. The 'bubbleSort' method will return the sorted array.

***CONCLUSION***
In this project, I have used Eclipse to create seven distinct sorting algorithms in Java, including Merge Sort, Heap Sort, 
Quick Sort (Regular and Three-Way), Insertion Sort, Selection Sort, and Bubble Sort. Each algorithm has distinctive properties and 
performance traits that make it appropriate for various use cases.
---------------------------------------------------------------------------------------------------------------------------------------# Sorting
