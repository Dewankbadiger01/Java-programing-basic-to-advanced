import java.util.*;

public class NQueen {

    public static void backtrack(
            int rows,
            Set<Integer> cols,
            Set<Integer> diags,
            Set<Integer> antiDiags,
            List<List<String>> board,
            int n,
            char[][] game) {

        if (rows == n) {

    System.out.println("Chess Board:");

    for (char[] r : game) {
        for (char c : r) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    System.out.println();

    return;
}

        for (int col = 0; col < n; col++) {

            if (cols.contains(col)) {
                continue;
            }

            int diag = rows - col;

            if (diags.contains(diag)) {
                continue;
            }

            int antiDiag = rows + col;

            if (antiDiags.contains(antiDiag)) {
                continue;
            }

            // Place Queen
            cols.add(col);
            diags.add(diag);
            antiDiags.add(antiDiag);

            game[rows][col] = 'Q';

            // Move to next row
            backtrack(rows + 1, cols, diags, antiDiags, board, n, game);

            // Backtrack
            cols.remove(col);
            diags.remove(diag);
            antiDiags.remove(antiDiag);

            game[rows][col] = '.';
        }
    }

    public static void main(String[] args) {

        int n = 8;

        List<List<String>> board = new ArrayList<>();

        Set<Integer> cols = new HashSet<>();
        Set<Integer> diags = new HashSet<>();
        Set<Integer> antiDiags = new HashSet<>();

        char[][] game = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                game[i][j] = '.';
            }
        }

        backtrack(
            0,
            cols,
            diags,
            antiDiags,
            board,
            n,
            game
        );

        System.out.println(board);
    }
}
