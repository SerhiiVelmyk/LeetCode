package medium;

public class CountBattleships {

    public static void main(String[] args) {
        char[][] board = {
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}};

        System.out.println(countBattleships(board));

    }


    private static int countBattleships(char[][] board) {
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;

                    for (int k = j + 1; k < board[i].length; k++) {
                        if (board[i][k] == 'X') {
                            board[i][k] = '.';
                        } else {
                            break;
                        }
                    }

                    for (int k = i + 1; k < board.length; k++) {
                        if (board[k][j] == 'X') {
                            board[k][j] = '.';
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        return count;
    }
}
