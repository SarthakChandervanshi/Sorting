import java.util.Scanner;

public class NewSort {
	
	public static void Insertion_Sort(int A[]) 
    { 
        int n = A.length; 
        for (int i = 1; i < n; ++i) 
        { 
            int temp = A[i]; 
            int j = i - 1; 
  
            while((j >= 0) && (A[j] > temp)) 
            { 
                A[j + 1] = A[j]; 
                j = j - 1; 
            } 
            A[j + 1] = temp; 
        } 
    } 

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int A[] = new int[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			A[i] = s.nextInt();
		}
		
		Insertion_Sort(A);
		
		System.out.print("The array after insertion sort:");
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		s.close();
	}


}
