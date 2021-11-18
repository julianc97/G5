package com.example.reto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {
    private lateinit var txvUsername: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        txvUsername = findViewById(R.id.txvUsername)
        txvUsername.setText(intent.getStringExtra("username"))
    }


    fun button1(button1: View) {
        val intento = Intent(this, Detalle1::class.java)
        startActivity(intento)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_todofragment, menu)
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