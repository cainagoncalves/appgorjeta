package com.example.appgorjeta

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    // Valor total conta
    // Número de pessoas
    // Porcentagem da gorjeta
    // 10, 15 ou 20%
    // Calcular
    // Limpar

    // Recuperar as Views do layout
    // Find view by id
    // ViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClean = findViewById<Button>(R.id.btn_clean)
        val btnDone = findViewById<Button>(R.id.btn_done)
        val edtTotal = findViewById<TextInputEditText>(R.id.tie_total)
        val edtNumPeople = findViewById<TextInputEditText>(R.id.tie_num_of_people)

        btnClean.setOnClickListener {

        }

    }
}