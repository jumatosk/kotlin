package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val firstDice = Dice(6)
        val secondDice = Dice(8)

        val firstDiceRoll = firstDice.roll()
        val secondDiceRoll = secondDice.roll()

        val firstResultTextView: TextView = findViewById(R.id.textView)
        val secondResultTextView: TextView = findViewById(R.id.textView2)

        firstResultTextView.text = firstDiceRoll.toString()
        secondResultTextView.text = secondDiceRoll.toString()
    }
}

class Dice(private val numberSides: Int) {
    fun roll(): Int {
        return (1..numberSides).random()
    }
}