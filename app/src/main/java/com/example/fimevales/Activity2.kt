package com.example.fimevales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val Iniciar = findViewById<Button>(R.id.Iniciar)
        Iniciar.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Bienvenido!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Activity4::class.java)

            startActivity(intent)
        })
    }

}