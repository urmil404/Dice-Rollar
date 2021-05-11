package com.example.diceroller

import android.animation.Animator
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        dice.run {
            dice.addAnimatorListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator) {
                }

                override fun onAnimationEnd(animation: Animator) {
                    hideDice()
                    val random = (1..6).random()
                    textView.text = random.toString()
                }

                override fun onAnimationCancel(animation: Animator) {}

                override fun onAnimationRepeat(animation: Animator) {}
            })
        }
    }

    private fun showDice() {
        dice.visibility = View.VISIBLE
        textView.visibility = View.GONE
        buttonroll.isEnabled = false
    }

    private fun hideDice() {
        dice.visibility = View.GONE
        textView.visibility = View.VISIBLE
        this.buttonroll.isEnabled = true
    }

    fun rollDiceClicked(view: View) {
        showDice()
        dice.playAnimation()
    }
}
