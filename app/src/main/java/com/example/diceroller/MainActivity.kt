package com.example.diceroller

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnshow = findViewById(R.id.buttonroll) as Button

        btnshow.setOnClickListener {
            val randomNumber = (1..6).random()
            val diceDigit: TextView = findViewById(R.id.textView)
            diceDigit.text = randomNumber.toString()
        }


    }

    private fun showDice() {
        dice.visibility = View.VISIBLE
        textView.visibility = View.GONE
        buttonroll.isEnabled = false
    }

    private fun hideDice() {

    }

    fun rollDiceClicked(view: View) {
        showDice()
        dice.playAnimation()
    }
}
