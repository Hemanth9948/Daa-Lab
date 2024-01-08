import java.io.*;
import java.util.*;
import java.util.Scanner; 
class QuickSort{
  static void swap(int[] arr, int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  static int partition(int[] arr, int low, int high)
  {
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j <= high - 1; j++) {
      if (arr[j] < pivot) {
        i++;
	swap(arr, i, j);
	}
      }
      swap(arr, i + 1, high);
      return (i + 1);
    }
  static void quickSort(int[] arr, int low, int high)
  {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
      }
  }
    static void printArr(int[] arr)
    {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
	    }
    }
public static void main(String[] args)
	{
		  Scanner sc= new Scanner(System.in);
		  QuickSort q=new QuickSort(); 
      Binaryrecursivesearch bs= new Binaryrecursivesearch();
      System.out.println("Enter Array Size:");
      int N= sc.nextInt();
      System.out.println("Enter Array Elements:");
      int arr[]= new int[N];
      for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
      }
		q.quickSort(arr, 0, N - 1);
		System.out.println("Sorted array:");
		q.printArr(arr);
	}
}

