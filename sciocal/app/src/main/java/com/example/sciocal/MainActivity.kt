package com.example.sciocal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var operand1: Double = 0.0
    private var operand2: Double = 0.0
    private var operation: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }

    fun numberClick(view: View) {
        if (view is Button) {
            val number: String = view.text.toString()
            val currentText: String = resultTextView.text.toString() + number
            resultTextView.text = currentText
        }
    }

    fun operationClick(view: View) {
        if (view is Button) {
            operation = view.text.toString()
            operand1 = resultTextView.text.toString().toDouble()
            resultTextView.text = ""
        }
    }

    fun equalsClick(view: View) {
        operand2 = resultTextView.text.toString().toDouble()
        var result: Double = 0.0
        when (operation) {
            "+" -> result = operand1 + operand2
            "-" -> result = operand1 - operand2
            "*" -> result = operand1 * operand2
            "/" -> result = operand1 / operand2
            "cos" -> result = cos(operand1)
            "sin" -> result = sin(operand1)
            "tan" -> result = tan(operand1)
            "pow" -> result = operand1.pow(operand2)
            "sqrt" -> result = sqrt(operand1)
            "log" -> result = log10(operand1)
            "tan" -> result = tan(operand1)
            "mod" -> result = operand1 % operand2
        }
        resultTextView.text = result.toString()
    }

    fun clearClick(view: View) {
        resultTextView.text = ""
        operand1 = 0.0
        operand2 = 0.0
        operation = ""
    }
}
