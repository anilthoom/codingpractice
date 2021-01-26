package com.anilt.ds.arrays;

public class BinarySearchWays {

	// Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    int binarySearchRecursive(int arr[], int lowValue, int highValue, int findThis) 
    { 
        if (highValue >= lowValue) { 
            int mid = lowValue + (highValue - lowValue) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == findThis) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > findThis) 
                return binarySearchRecursive(arr, lowValue, mid - 1, findThis); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearchRecursive(arr, mid + 1, highValue, findThis); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
  
    // Returns index of x if it is present in arr[], 
    // else return -1 
    int binarySearchIterative(int arr[], int findThis) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == findThis) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < findThis) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
 // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearchWays ob = new BinarySearchWays(); 
        int arr[] = { 1, 2, 3, 4, 6, 7, 8 }; 
        int length = arr.length; 
        int findThis = 3; 
//        int result = ob.binarySearchRecursive(arr, 0, length - 1, findThis);
        int result = ob.binarySearchIterative(arr, findThis); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    }
}
