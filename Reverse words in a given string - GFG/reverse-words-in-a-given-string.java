//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
        int n = s.length()-1;
        StringBuilder str = new StringBuilder();
        StringBuilder res = new StringBuilder();
        
        for(int i = n; i>= 0;i--)
        {
            char ch = s.charAt(i);
            if(ch == '.')
            {
                str = str.reverse();
                str.append(".");
                res.append(str);
                str.setLength(0);
                
            }
            else
            {
                str.append(ch);
            }
        }
        if(str.length()>0)
        {
            str = str.reverse();
            res.append(str);
        }
        return res.toString();
    }
}