package com.example.melany_examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

lateinit var n1: EditText
lateinit var n2: EditText
lateinit var btn_suma: Button

class suma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)

        n1 = findViewById(R.id.n1)
        n2 = findViewById(R.id.n2)
        btn_suma = findViewById(R.id.btn_suma)
        btn_suma.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(n1.text.toString())
            val num2 = Integer.parseInt(n2.text.toString())


        })


        val btn: Button = findViewById(R.id.btn_suma)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, resultado::class.java)
            startActivity(intent)
        }
    }
}