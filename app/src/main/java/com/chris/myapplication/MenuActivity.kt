package com.chris.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.chris.myapplication.PrimeraApp.PrimeraAplicacion
import com.chris.myapplication.Settings.SettingsActivity
import com.chris.myapplication.ToDoApp.ToDoActivity
import com.chris.myapplication.imccalculator.ImcCalculatorActivity
import com.chris.myapplication.superheroapp.SuperHeroListActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnToDo = findViewById<Button>(R.id.btnToDo)
        val btnSuperHeroApp = findViewById<Button>(R.id.btnSuperHeroApp)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSaludApp.setOnClickListener{ navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnToDo.setOnClickListener { navigateToDoApp() }
        btnSuperHeroApp.setOnClickListener { navigateToSuperHeroApp() }
        btnSettings.setOnClickListener { navigateToSettings() }

    }


    private fun navigateToSaludApp(){
        val intent = Intent(this, PrimeraAplicacion::class.java )
        startActivity(intent)
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java )
        startActivity(intent)
    }

    private fun navigateToDoApp(){
        val intent = Intent(this, ToDoActivity::class.java )
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java )
        startActivity(intent)
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java )
        startActivity(intent)
    }
}