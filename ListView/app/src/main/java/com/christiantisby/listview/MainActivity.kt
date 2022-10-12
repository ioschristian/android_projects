package com.christiantisby.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        var countryList = resources.getStringArray(R.array.countries) //get the string array

        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryList)  // create the adapter
        listView.adapter = arrayAdapter // connect the listview

        listView.setOnItemClickListener { parent, view, position, id ->

            val countryName: String = parent.getItemAtPosition(position).toString()

            Toast.makeText(applicationContext, "You selected " + countryName, Toast.LENGTH_LONG).show()
        }
    }
}