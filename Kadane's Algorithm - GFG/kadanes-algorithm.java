//{ Driver Code Starts
import java.io.*;

import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        long sum_till_now=0;
        long max_till_now=-999;
        
        for(long i=0;i<n;i++)
        {
            sum_till_now += arr[(int)i];
            if(max_till_now < sum_till_now)
            {
                max_till_now = sum_till_now;
            }
            if(sum_till_now < 0)
            {
                sum_till_now = 0;
            }
            
        }
        return max_till_now;
    }
    
}

