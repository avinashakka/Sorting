import java.io.*;
import java.util.*;

public class InsertionSort
{
	static int[] sortarray(int[] A)
	{
		int size = A.length;

		for(int i=1;i<size;i++)
		{
			//displayA(A);
			int key = A[i];
			int j=i-1;
			while(j>=0 && A[j]>key)
			{
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = key;			
		}
		return A;		
		
	}
	
	static void displayA(int[] A)
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter size of array");
		int x = S.nextInt();
		int[] A = new int[x];
		for(int i=0;i<x;i++)
		{
			A[i] = S.nextInt();
		}
		A = sortarray(A);
		System.out.println("Sorted array: ");
		for(int i=0;i<x;i++)
		{
			System.out.print(A[i] + " ");
		}
	}
}