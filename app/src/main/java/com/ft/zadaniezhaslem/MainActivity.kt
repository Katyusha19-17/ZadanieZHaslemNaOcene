package com.ft.zadaniezhaslem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 0
        var przycisk = findViewById<Button>(R.id.BT1)

        przycisk.setOnClickListener {
            var haslo = findViewById<TextInputEditText>(R.id.TIET1)

            if (findViewById<TextInputEditText>(R.id.TIET1).text.toString() == findViewById<TextInputEditText>(R.id.TIET2).text.toString())
            {
                findViewById<CheckBox>(R.id.ChB5).isChecked = true
            }
            var i = 0
            i.toInt()
            var listaLiterkow = mutableListOf<Char>()

            for(i in 1.. haslo.text.toString().length){
                listaLiterkow[i]=haslo.text.toString().get(i)
                if(listaLiterkow[i].toUpperCase() == true)
            }
        }
    }
}