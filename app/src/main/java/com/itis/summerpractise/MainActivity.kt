package com.itis.summerpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton = findViewById<Button>(R.id.calculateButton)
        calculateButton.setOnClickListener {
            dataCalculation()
        }
    }

    private fun calculateCcal(length: Int?, weight: Double?, age: Int?): Double {
        return (length ?: 0) * (weight ?: 0.0) * (age ?: 0)
    }

    private fun calculateNDS(length: Int?, weight: Double?, age: Int?): Double {
        return (length ?: 0) * (weight ?: 0.0) * (age ?: 0) * 5.0
    }

    private fun calculateNDFL(length: Int?, weight: Double?, age: Int?): Double {
        return (length ?: 0) * (weight ?: 0.0) * (age ?: 0) * 7.0
    }

    private fun calculateMortgage(length: Int?, weight: Double?, age: Int?): Double {
        return (length ?: 0) * (weight ?: 0.0) * (age ?: 0) * 17

    }

    private fun calculateHoroscope(length: Int?, weight: Double?, age: Int?): String {
        val ans = (length ?: 0) + (weight ?: 0.0) + (age ?: 0)
        if (ans > 0) {
            return when {
                ans % 2 == 0.0 -> "Вам сегодня круто повезет!"
                ans % 2 == 1.0 -> "сегодня вы встретите нового друга!"
                else -> return "Вы удачливый человек"
            }
        } else {
            return "Возраст не указан"
        }
    }

    private fun dataCalculation() {
        val name = findViewById<EditText>(R.id.editName).text.toString()
        val length = findViewById<EditText>(R.id.editLength).text.toString().toIntOrNull()
        val weight = findViewById<EditText>(R.id.editWeight).text.toString().toDoubleOrNull()
        val age = findViewById<EditText>(R.id.editAge).text.toString().toIntOrNull()
        val ans = findViewById<TextView>(R.id.textView)
        if (isCorrectInputFields(name, length ?: 0, weight ?: 0.0, age ?: 0)) {
            ans.text = "Уважаемый $name,\nКилокалории: ${calculateCcal(length, weight, age)}" +
                    "\nНдс: ${calculateNDS(length, weight, age)}" +
                    "\nНДФЛ: ${calculateNDFL(length, weight, age)}" +
                    "\nИпотека: ${calculateMortgage(length, weight, age)}" +
                    "\nГороскоп: ${calculateHoroscope(length, weight, age)}"
        } else {
            ans.text = "Данные введены некорректно"
        }
    }

    private fun isCorrectInputFields(name: String, length: Int, weight: Double, age: Int): Boolean {
        return name.length in 1..50 &&
                length <= 250 && length > 0 &&
                weight <= 250 && weight > 0 &&
                age <= 150 && age > 0
    }
}