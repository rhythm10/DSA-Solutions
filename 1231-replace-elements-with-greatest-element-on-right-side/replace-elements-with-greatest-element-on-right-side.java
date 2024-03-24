class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];

        arr[arr.length-1] = -1;

        for(int i=arr.length-2;i>=0;i--)
        {
            int current = arr[i]; // Store the current value before updating it
            arr[i] = max; // Replace the current element with the max
            if (current > max) { // Check if the current value is greater than max
                max = current; // If so, update max
            }
        }

        return arr;
    }
}