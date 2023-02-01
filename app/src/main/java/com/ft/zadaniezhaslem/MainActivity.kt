package com.ft.zadaniezhaslem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var przycisk = findViewById<Button>(R.id.BT1)

        przycisk.setOnClickListener {
            if(findViewById<TextInputEditText>(R.id.TIET1).text.toString() == findViewById<TextInputEditText>(R.id.TIET2).text.toString()){
                findViewById<CheckBox>(R.id.ChB5).isChecked = true
            }

        }
    }
}