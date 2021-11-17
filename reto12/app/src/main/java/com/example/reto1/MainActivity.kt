package com.example.reto1

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private var edtUsername: EditText? = null
    private var edtPassword: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        edtUsername = findViewById(R.id. edtUsername)
        edtPassword = findViewById(R.id. edtPassword)
    }




    fun onLogin(botonLogin: View) {

        val positiveButton = { dialog: DialogInterface, which: Int ->
            val intento = Intent(this, WelcomeActivity::class.java)
            intento.putExtra("username",edtUsername!!.text.toString())
            startActivity(intento)
        }

        val negativeButton = {_: DialogInterface, _: Int ->}

        if(edtUsername!!.text.toString()=="Ifa@email.com "){
            if(edtPassword!!.text.toString()=="123"){
                var dialog = AlertDialog.Builder(this)
                    .setTitle("Welcome")
                    .setMessage("User: " + edtUsername!!.text.toString())
                    .setPositiveButton("ok", positiveButton)
                    .setNegativeButton("Cancel",negativeButton)
                    .create()
                    .show()
            }
            else{
                Toast.makeText(this, R.string.text_error_message, Toast.LENGTH_LONG).show()

                /* var dialog = AlertDialog.Builder(this)
                    .setTitle(R.string.text_error)
                    .setMessage(R.string.text_error_message).create().show()

                 */
            }
        }
    }

    fun onRegister(botonLogin: View) {
        val intento = Intent(this, WelcomeRegister::class.java)
            startActivity(intento)
    }



}