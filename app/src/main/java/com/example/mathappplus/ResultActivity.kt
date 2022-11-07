package com.example.mathappplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var input : EditText
    lateinit var output : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        
    }
}