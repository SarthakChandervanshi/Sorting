import java.util.*;
public class Bubble_Sort 
{
	
	public static void bubble_sort(int[] A) 
	{  
        int n = A.length;  
        int temp = 0;  
         for(int i = 0 ; i < n ; i++)
         {  
                 for(int j = 1 ; j < (n - i) ; j++)
                 {  
                          if(A[j - 1] > A[j])
                          {  
                                 temp = A[j - 1];  
                                 A[j - 1] = A[j];  
                                 A[j] = temp;  
                         }  
                          
                 }  
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
		
		bubble_sort(A);
		
		System.out.print("The array after bubble sort:");
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		s.close();
	}

}
