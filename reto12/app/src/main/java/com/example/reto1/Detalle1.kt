package com.example.reto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class Detalle1 : AppCompatActivity() {

    val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle1)
        val carrousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNlZ4E86mlPnwrfIQ3XYaeXbVlA0t_LTBGwGZMIimfRmXGiXwWFf1R6ouGl4llbTjoqms&usqp=CAU"))
        list.add(CarouselItem("https://pim-img-psmt1.aeropost.com/n/9/c/7/3/9c7393f437c3afad616e698587ecb0239962566d_HomeDecorNatural_515145_01.jpg"))
        list.add(CarouselItem("https://cortinasnovaluxe.com/wp-content/uploads/2018/05/cortina-sala-013.jpg"))
        carrousel.addData(list)

        // Cargar Color Cortina
        val spColorCortina = findViewById<Spinner>(R.id.spColorCortina)
        val lstColorCortina = resources.getStringArray(R.array.mColorCortinas)
        val adapterColorCortina = ArrayAdapter(this, android.R.layout.simple_spinner_item, lstColorCortina)
        spColorCortina.adapter = adapterColorCortina

        val spAltoCortina = findViewById<Spinner>(R.id.spAltoCortina)
        val lstAltoCortina = resources.getStringArray(R.array.mAltoCortinas)
        val adapterAltoCortina = ArrayAdapter(this, android.R.layout.simple_spinner_item, lstAltoCortina)
        spAltoCortina.adapter = adapterAltoCortina

    }

    fun comprar1(view: View) {
        val intento = Intent(this, MainActivity4::class.java)
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
