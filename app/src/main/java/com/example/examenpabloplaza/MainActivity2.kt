package com.example.examenpabloplaza

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity2: AppCompatActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establecemos el layout para la actividad.
        setContentView(R.layout.activity_main2)

        // Referenciamos al ListView del layout.
        val listViewProvinces = findViewById<ListView>(R.id.listViewProvinces)
        // Creamos una lista de provincias.
        val provinces = listOf(
            "Ávila", "Burgos", "León", "Palencia", "Salamanca",
            "Segovia", "Soria", "Valladolid", "Zamora"
        )

        // Creamos un adaptador que conectará los datos con nuestro ListView.
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, provinces)
        // Asignamos el adaptador al ListView.
        listViewProvinces.adapter = adapter

        // Establecemos un listener que reaccionará cuando se haga clic en un ítem del ListView.
        listViewProvinces.setOnItemClickListener { _, _, position, _ ->
            // Creamos un nuevo Intent para enviar el resultado de vuelta.
            val intent = Intent()
            // Añadimos la provincia seleccionada al Intent.
            intent.putExtra("province", provinces[position])
            // Establecemos el resultado de la actividad con el Intent y RESULT_OK.
            setResult(Activity.RESULT_OK, intent)
            // Finalizamos la actividad, cerrándola y volviendo a la anterior.
            finish()
        }
    }
}
