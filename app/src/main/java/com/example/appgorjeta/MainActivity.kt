package com.example.appgorjeta

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.appgorjeta.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    // Valor total conta
    // Número de pessoas
    // Porcentagem da gorjeta
    // 10, 15 ou 20%
    // Calcular
    // Limpar

    // Recuperar as Views do layout
    // ViewBinding

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClean.setOnClickListener {

        }

    }
}