package com.example.laboratorio2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var contador = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnLongClickListener{
            if (contador <=10 ){
                val aviso = 10 - contador
                Toast.makeText(this, "Faltan " + aviso.toString()  + " para el objetivo", Toast.LENGTH_SHORT).show()

            }
            if (contador > 10 ){
                val aviso = 20 - contador
                Toast.makeText(this, "Faltan " + aviso.toString()  + " para el objetivo", Toast.LENGTH_SHORT).show()

            }

            true
        }



    }

    fun ContarVuelta(view: View) {

        val rollButton1: EditText = findViewById(R.id.editText2)
        val Imagen: ImageView = findViewById(R.id.imageView)
        val Imagen2: ImageView = findViewById(R.id.imageView2)
        if (contador <=20) {
            contador = contador + 1
                rollButton1.setText(contador.toString())
            if(contador == 10){
                Toast.makeText(this, "Llegaste al objetivo", Toast.LENGTH_SHORT).show()
                Imagen.visibility = View.VISIBLE
            }
            if(contador > 10){
                Imagen.visibility = View.GONE
            }
            if(contador < 10){
                Imagen.visibility = View.GONE
            }
            if(contador == 20){
                Toast.makeText(this, "FELICITACIONES", Toast.LENGTH_SHORT).show()
                Imagen2.visibility = View.VISIBLE
            }
            if(contador < 20){
                Imagen2.visibility = View.GONE
            }
            if(contador > 20){
                Imagen.visibility = View.GONE
            }

            }
        if (contador > 20){
            contador = 20
            rollButton1.setText(contador.toString())
        }
        }


    fun Reiniciar(view: View) {
        val Imagen: ImageView = findViewById(R.id.imageView)
        val Imagen2: ImageView = findViewById(R.id.imageView2)
        val rollButton1: EditText = findViewById(R.id.editText2)
        contador = 0
        rollButton1.setText(contador.toString())
        Imagen2.visibility = View.GONE
        Imagen.visibility = View.GONE
    }

}
