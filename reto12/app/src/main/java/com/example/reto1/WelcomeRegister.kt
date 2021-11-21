package com.example.reto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class WelcomeRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_register)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_welcome_register, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_search -> {
                Toast.makeText(this, R.string.text_action_search, Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_settings -> {
                Toast.makeText(this, R.string.text_action_settings, Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_logout -> {
                val intento = Intent(this, WelcomeActivity::class.java)
                startActivity(intento)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}