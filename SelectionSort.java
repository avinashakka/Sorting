import java.io.*;
import java.util.*;

public class SelectionSort
{
	static int[] sortarray(int[] A)
	{
		int size = A.length;

		for(int i=0;i<size;i++)
		{
		    int min = A[i];
			int pointer = i;
			for(int j=i+1;j<size;j++)
			{
				if(A[j] < min)
				{
					min = A[j];
					pointer = j;
				}				
			}
			//Swap elements
				A[pointer] = A[i];
			    A[i] = min;
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