package com.example.melany_examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textView1: TextView = findViewById(R.id.rfinal)
        val receivedMessage: String = intent.extras?.getString("La_suma_es").orEmpty()
        textView1.text = receivedMessage

    }
}