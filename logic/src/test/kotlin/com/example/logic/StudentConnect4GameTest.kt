package com.example.logic

import StudentConnect4Game
import com.example.lib.Connect4Game
import com.example.testlib.Connect4Test
import org.junit.jupiter.api.Assertions.*

internal class StudentConnect4GameTest : Connect4Test() {
    override fun createGame(columns: Int, rows: Int): Connect4Game {
        return StudentConnect4Game(columns, rows)
    }
}