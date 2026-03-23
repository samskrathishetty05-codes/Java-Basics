package sam.learning;

public class TicTacToe {
        public String tictactoe(int[][] moves) {

            char[][] board = new char[3][3];

            for(int i=0; i< moves.length; i++) {
                int a = moves[i][0];
                int b = moves[i][1];
                if(i%2 == 0) {
                    board[a][b] = 'X';
                } else {
                    board[a][b] = 'O';
                }
            }

            if(winner(board, 'X')) return "A";
            if(winner(board, 'O')) return "B";
            if (moves.length == 9) return "Draw";
            return "Pending";

        }

        boolean winner(char[][] board, char ch) {
            for(int i = 0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    if(board[i][0]== ch && board[i][1]== ch && board[i][2]== ch) return true;
                    if(board[0][i]== ch && board[1][i]== ch && board[2][i]== ch) return true;
                }
            }

            if(board[0][0]== ch && board[1][1]== ch && board[2][2]== ch) return true;
            if(board[0][2]== ch && board[1][1]== ch && board[2][0]== ch) return true;

            return false;
    }
}
