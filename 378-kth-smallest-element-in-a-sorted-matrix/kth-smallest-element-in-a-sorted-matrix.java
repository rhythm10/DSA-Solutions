class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            // Count elements less than or equal to mid
            for (int i = 0; i < n; i++) {
                count += countLessEqual(matrix[i], mid);
            }

            // Adjust binary search bounds
            if (count >= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int countLessEqual(int[] row, int mid) {
        int count = 0;
        for (int num : row) {
            if (num <= mid) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
