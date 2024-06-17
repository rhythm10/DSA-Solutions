class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<Integer> tempRes = new ArrayList<>();

        solve(0, n, tempRes, res);
        return res;
    }

    private void solve(int row, int n, List<Integer> tempRes, List<List<String>> res) {
        if (row == n) {
            res.add(generateBoard(tempRes, n));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, tempRes)) {
                tempRes.add(col);
                solve(row + 1, n, tempRes, res);
                tempRes.remove(tempRes.size() - 1);
            }
        }
    }

    private List<String> generateBoard(List<Integer> tempRes, int n) {
        List<String> board = new ArrayList<>();
        for (int i : tempRes) {
            char[] row = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = '.';
            }
            row[i] = 'Q';
            board.add(new String(row));
        }
        return board;
    }

     private boolean isSafe(int row, int col, List<Integer> tempRes) {
        for (int i = 0; i < row; i++) {
            int placedCol = tempRes.get(i);
            if (placedCol == col || placedCol - i == col - row || placedCol + i == col + row) {
                return false;
            }
        }
        return true;
    }
}