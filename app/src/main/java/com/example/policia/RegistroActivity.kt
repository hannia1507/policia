package com.example.policia


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resgistro)

        val registerButton: Button = findViewById(R.id.registerButton)

        registerButton.setOnClickListener {
            // Lógica para registrar al usuario (validaciones o guardado en base de datos)
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()

            // Redirigir a la actividad de inicio de sesión
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}
