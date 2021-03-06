import com.example.lib.Connect4Game

class StudentConnect4Game (
    override val columns: Int = 7,
    override val rows: Int = 10
): Connect4Game {

    /** Set up two-dimensional array of integer, of size columns x rows
     * and fill it with zeroes.
     */
    private var data: Array<IntArray> = Array(columns) { IntArray(rows) { 0 } }

    // Not specified in the interface - just to show that other things can be added
    /**
     * This determines the player who's turn it currently is.
     */
    var playerTurn: Int = 1
        private set

    override fun getToken(column: Int, row: Int): Int {
        return data[column][row]
       // TO_DO("Not yet implemented")
    }

    override fun playToken(column: Int, player: Int): Boolean {
        if (player <= 0) {
            throw IllegalArgumentException("Player numbers start with 1")
        }

        for (row in 0 until rows) {
            // If we find an empty cell we set it with the token and return
            // The return breaks our loop so it only gets set (maximum) once
            if (data[column][row] == 0) {
                data[column][row] = player
                return true
            }
        }
        return false      // illegal move
       // TO_DO("Not yet implemented")
    }
}