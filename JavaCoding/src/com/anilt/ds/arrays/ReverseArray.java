package com.anilt.ds.arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int array[] =  {1, 2, 3, 4, 5, 6, 7};
		//Output must be {3,4,5,6,7,1,2}
		int n = array.length;
		int d = 2;
		d = d%n;
		
//		int outputArr[] = leftRotate(array, d);
//		System.out.print("{ ");
//		for (int i : outputArr) {
//			System.out.print(i + " ");
//		}
//		System.out.print(" }");
//		
		int outputArr2[] = rightRotate(array, 3);
		System.out.print("{ ");
		for (int i : outputArr2) {
			System.out.print(i + " ");
		}
		System.out.print(" }");
		
		int reverseArr[] = reverseArray(array, 0, array.length-1);
		for (int i : reverseArr) {
			System.out.print(i + " ");
		}
	}
	 /* Function to left rotate arr[] of size n by d */
    static int[] leftRotate(int arr[], int d) 
    { 
        int n = arr.length; 
        reverseArray(arr, 0, d-1); 
        reverseArray(arr, d, n-1); 
        reverseArray(arr, 0, n-1);
        return arr;
    } 
    
    /* Right rotation of array of size n by d */
    static int[] rightRotate(int arr[], int d)
    {
    	int n = arr.length;
    	reverseArray(arr, n-d, n-1);
    	reverseArray(arr, 0, n-d-1);
    	reverseArray(arr, 0, n-1);
    	return arr;
    }
	//Reverse the array
	public static int[] reverseArray(int arr[], int start, int end)
	{
		while(start < end)
		{
			int temp = arr[start];
			arr[start] =  arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
		return arr;
	}
}
