//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int start = 0, end = n-1, mid=0, index=0;
        while(start <= end)
        {
            mid = (start + end) / 2;
            if(arr[mid] == x)
            {
                index = mid;
                break;
            }
            else if(arr[mid] < x)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        
        int res=0, temp = index-1;
        
        if(arr[index] == x) res++;
        
        while((temp >= 0) && (x == arr[temp]))
        {
            res++;
            temp--;
        }
        
        temp = index+1;
        
        while((temp < n) && (x==arr[temp]))
        {
            res++;
            temp++;
        }
        
        return res;
    }
}