package com.christiantisby.buttons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var doMagic: Button
    lateinit var myButton: Button
    lateinit var myText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doMagic = findViewById(R.id.doMagic)
        myButton = findViewById(R.id.button2)
        myText = findViewById(R.id.textExample)

        doMagic.setOnClickListener {
            doMagic.setBackgroundColor(Color.BLACK)
            myText.setText("Lets Dance!!!")
            myText.isVisible = false
        }

        myButton.setOnClickListener {
            myText.isVisible = true
            doMagic.isVisible = true
            myText.setText("Tag Team Back Again")
        }
    }
}