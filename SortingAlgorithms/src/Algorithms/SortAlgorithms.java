package Algorithms;



public final class SortAlgorithms {
	
	//---------------------MergeSort--------------------
	
	private static void mergeSort(Comparable a[], int k) {
		Comparable[] right, left;
		if (a.length > 1) {
			int middle = (int) a.length / 2;
			left = new Comparable[middle];
			if (a.length % 2 == 0) {
				right = new Comparable[middle];
			} else {
				right = new Comparable[middle+1];
			}
			for (int i=0; i<middle;i++) {
				left[i] = a[i];
			}
			for (int i=0; i<right.length;i++) {
				right[i] = a[i+middle];
			}
			mergeSort(left, k);
			mergeSort(right, k);
			merge(a, left, right, k);
		}
	}
	
	private static void merge(Comparable result[], Comparable left[], Comparable right[], int k) {
		int i=0,j=0;
		while(i < left.length && j < right.length) {
			if(left[i].compareTo(right[j])*k < 0) {
				result[i+j] = left[i];
				i++;
			} else {
				result[i+j] = right[j];
				j++;
			}
		}
		for(; i < left.length; i++) {
			result[i+j] = left[i];
		}
		for(; j < right.length; j++) {
			result[i+j] = right[j];
		}
	}
	
	public static void mergeSort(Comparable a[]) {
		mergeSort(a, 1);
	}
	
	public static void reverseMergeSort(Comparable a[]) {
		mergeSort(a, -1);
	}
	
	//---------------------QuickSort--------------------
	
	private static void quickSort(Comparable a[], int k, int first, int last) {
		int pivote = (first+last)/2;
		int i = first;
		int j = last;
		while (i < j) {
			while(a[i].compareTo(a[pivote])*k < 0) i++;
			while(0 < a[j].compareTo(a[pivote])*k) j--;
			if (i < j) {
				Comparable aux = a[i];
				a[i] = a[j];
				a[j] = aux;
				i++;
				j--;
			}
		}
		if (first < j) {
			quickSort(a,k,first,j);
		}
		if (i < last) {
			quickSort(a,k,i+1,last);
		}
	}
	
	public static void quickSort(Comparable a[]) {
		quickSort(a, 1, 0, a.length-1);
	}
	
	public static void reverseQuickSort(Comparable a[]) {
		quickSort(a, -1, 0, a.length-1);
	}
	
	//--------------------BubbleSort--------------------
	
	private static void bubbleSort(Comparable a[], int k) {
		int i=1;
		boolean ordenado = false;
		while (i < a.length && !ordenado) {
			i++;
			ordenado = true;
			for(int j=0; j<=a.length-i;j++) {
				if ((a[j].compareTo(a[j+1]))*k > 0) {
					ordenado = false;
					Comparable aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
			}
		}
	}
	
	public static void bubbleSort(Comparable a[]) {
		bubbleSort(a,1);
	}
	
	public static void reverseBubbleSort(Comparable a[]) {
		bubbleSort(a,-1);
	}
		
	//------------------InsertionSort-------------------
	
	private static void insertionSort(Comparable a[], int k) {
		for (int i=1; i<a.length; i++) {
			int j=i;
			while (j>0 && a[j-1].compareTo(a[j])*k > 0) {
				Comparable aux = a[j-1];
				a[j-1] = a[j];
				a[j] = aux;
				j--;
			}
		}
	}
	
	public static void insertionSort(Comparable a[]) {
		insertionSort(a,1);
	}
	
	public static void reverseInsertionSort(Comparable a[]) {
		insertionSort(a,-1);
	}
	
	//------------------SelectionSort-------------------
	//---------------------HeapSort---------------------
	//-------------------CocktailSort-------------------
}
