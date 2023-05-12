package com.chris.myapplication.PrimeraApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.chris.myapplication.R

class PrimeraAplicacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera_aplicacion)
        val btnStart=findViewById<AppCompatButton>(R.id.btnStart)
        val etName=findViewById<AppCompatEditText>(R.id.etName)



        btnStart.setOnClickListener{
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                //Log.i("ChrisPer" ,"Button Pulsado $name")
                val intent = Intent(this,ResultadoActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
            }

        }
    }
}
