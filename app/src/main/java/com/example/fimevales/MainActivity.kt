package com.example.fimevales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    initEvents()
    }
    fun initEvents()
    {
        val buttonInitSesion = findViewById<Button>(R.id.INICIAR_SESION);
        buttonInitSesion.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
        }
        val buttonCreateSesion = findViewById<Button>(R.id.CREARCUENTA);
        buttonCreateSesion.setOnClickListener{
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
    }
}