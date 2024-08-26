package com.example.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn: Button = findViewById(R.id.button)

        btn.setOnClickListener {


            val editTextNum1: EditText = findViewById(R.id.editTextNum1)
            val editTextNum2: EditText = findViewById(R.id.editTextNum2)
            val resultView: TextView = findViewById(R.id.resultView)

            val num1 = editTextNum1.text.toString().toInt()
            val num2 = editTextNum2.text.toString().toInt()
            val result = num1 + num2
            // Display Result
            resultView.text = "Result: $result"
        }


    }
}