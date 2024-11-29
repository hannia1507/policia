package com.example.policia

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val goToLoginButton: Button = findViewById(R.id.goTologinButton)
        val goToRegisterButton: Button = findViewById(R.id.goToregisterButton)

        // Redirigir a la actividad de Inicio de Sesión
        goToLoginButton.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }

        // Redirigir a la actividad de Registro
        goToRegisterButton.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
    }

