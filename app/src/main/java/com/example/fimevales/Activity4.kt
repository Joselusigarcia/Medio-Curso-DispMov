package com.example.fimevales

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Activity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val imagenview = findViewById<ImageView>(R.id.Cafete)
        val verimagen = findViewById<ImageView>(R.id.qr)
        val btn1 = findViewById<Button>(R.id.Menu)
        val btn2 = findViewById<Button>(R.id.Vales)
        var mostrar: Boolean = false

        imagenview.setVisibility(View.INVISIBLE)
        verimagen.setVisibility(View.INVISIBLE)

        btn1.setOnClickListener({
            if(mostrar)
            {
                imagenview.setVisibility(View.INVISIBLE)
                mostrar = false
            }
            else
            {
                imagenview.setVisibility(View.VISIBLE)
                mostrar = true
            }
        })

        btn2.setOnClickListener({
            if(mostrar)
            {
                verimagen.setVisibility(View.INVISIBLE)
                mostrar = false
            }
            else
            {
                verimagen.setVisibility(View.VISIBLE)
                mostrar = true
            }
        })

    }
}