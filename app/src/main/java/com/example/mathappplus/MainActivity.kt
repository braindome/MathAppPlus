package com.example.mathappplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var firstNumberEditText : EditText
    lateinit var secondNumberEditText : EditText

    var firstNumber = 0
    var secondNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberEditText = findViewById(R.id.firstNumberPlainText)
        secondNumberEditText = findViewById(R.id.secondNumberPlainText)


        val buttonPlus = findViewById<Button>(R.id.additionButton)
        val buttonMinus = findViewById<Button>(R.id.subtractionButton)
        val buttonTimes = findViewById<Button>(R.id.multiplicationButton)

        buttonPlus.setOnClickListener() {
            firstNumber = firstNumberEditText.text.toString().toInt()
            secondNumber = secondNumberEditText.text.toString().toInt()
            Log.d("!!!", addition().toString())
        }

        buttonMinus.setOnClickListener() {
            firstNumber = firstNumberEditText.text.toString().toInt()
            secondNumber = secondNumberEditText.text.toString().toInt()
            Log.d("!!!", subtraction().toString())
        }

        buttonTimes.setOnClickListener() {
            firstNumber = firstNumberEditText.text.toString().toInt()
            secondNumber = secondNumberEditText.text.toString().toInt()
            Log.d("!!!", multiplication().toString())
        }

    }

    fun addition() : Int {
        return firstNumber + secondNumber
    }

    fun subtraction() : Int {
        return firstNumber - secondNumber
    }

    fun multiplication() : Int {
        return firstNumber * secondNumber
    }
}