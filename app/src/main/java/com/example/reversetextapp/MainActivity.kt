package com.example.reversetextapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.inputText)
        val convertButton = findViewById<Button>(R.id.convertButton)
        val resultText = findViewById<TextView>(R.id.resultText)
        val charCountText = findViewById<TextView>(R.id.charCountText)

        convertButton.setOnClickListener {
            val inputString = inputText.text.toString()

            // Удаляем пробелы для подсчёта символов
            val cleanedString = inputString.replace("\\s".toRegex(), "")
            val charCount = cleanedString.length

            // Реверсируем строку
            val reversedString = inputString.reversed()

            resultText.text = "Результат: $reversedString"
            charCountText.text = "Количество символов (без пробелов): $charCount"
        }
    }
}