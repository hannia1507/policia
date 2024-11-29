package com.example.policia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


    class ReportActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_report)

            val logoutButton = findViewById<Button>(R.id.logoutButton)

            logoutButton.setOnClickListener {
                // Regresar al login
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Finalizar este Activity
            }
        }
        }
