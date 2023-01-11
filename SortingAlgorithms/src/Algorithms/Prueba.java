package Algorithms;

public class Prueba {

	public static void main(String[] args) {
		Integer a[] = {30,32,18,1,3};
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------------");
		SortAlgorithms.reverseInsertionSort(a);
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}