package com.example.creardo_spinners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creacion de un spinner desde android developers
        //crear la variable
        val spinner: Spinner = findViewById(R.id.planetas_spinner)
        // crea el adapter y lo utilizaa, el primer trozo es para crear el adaptador y luego usa el adaptador
        ArrayAdapter.createFromResource(// metodo que permite crear el array de strings-- es un metodo de clase que son estaticos y se pueden usar sin crear un objeto de la clase
            this,
            R.array.planetas_array,// referencia al array de strings
            android.R.layout.simple_spinner_item//es el layout por defecto
        ).also{ adapter->// se usa el adptador creado
            // se va a especificar que layoit en uso cuando aparezcan las opciones de la lista
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)//el metodo setdropDownViewResource especifrica el layout
            //se aplica a spinner el adapador creado (adapter)
            spinner.adapter = adapter
        }


        val spinner2 :Spinner = findViewById(R.id.planetas_spinner)
        spinner2.onItemSelectedListener = this

    }


    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos : Int, id: Long) {
       val textview : TextView =findViewById(R.id.textview) //el que se debe crear para poner el texto)
      // val spinner: Spinner = findViewById(R.id.planetas_spinner)
       //textview.text= spinner.
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        TODO("Not yet implemented")
    }


}