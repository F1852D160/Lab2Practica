package com.example.lab2practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    var fragment1:Fragment1? = null
    var fragment2:Fragment2? = null
    var fragment3:Fragment3? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragment1 = Fragment1()
        fragment2 = Fragment2()
        fragment3 = Fragment3()

        val btn1 = findViewById<Button>(R.id.btnMostrarF1)
        val btn2 = findViewById<Button>(R.id.btnMostrarF2)
        val btn3 = findViewById<Button>(R.id.btnMostrarF3)

        btn1.setOnClickListener {
            val trn = getSupportFragmentManager().beginTransaction()
            trn.replace(R.id.frameContenedor,fragment1!!)
            trn.commit()

        }

        btn2.setOnClickListener {
            val trn = getSupportFragmentManager().beginTransaction()
            trn.replace(R.id.frameContenedor,fragment2!!)
            trn.commit()

        }


        btn3.setOnClickListener {
            val trn = getSupportFragmentManager().beginTransaction()
            trn.replace(R.id.frameContenedor,fragment3!!)
            trn.commit()

        }

    }
}