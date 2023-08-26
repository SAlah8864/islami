package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val fruit= arrayOf("apple","bananna","peach","watermelon","lemons","apple","bananna","peach","watermelon","lemons")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myadapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruit)
        mylist.adapter = myadapter
        mylist.setOnItemClickListener { _, view, position, l ->
            val textview = view as TextView
            when (position) {
                0 -> {
                    Toast.makeText(this, textview.text.toString(), Toast.LENGTH_LONG).show()
                }
                1 -> {
                    Toast.makeText(this, textview.text.toString(), Toast.LENGTH_LONG).show()
                }
                2 -> {
                    Toast.makeText(this, textview.text.toString(), Toast.LENGTH_LONG).show()
                }
                3 -> {
                    Toast.makeText(this, textview.text.toString(), Toast.LENGTH_LONG).show()
                }

            }


        }




        fun toaste(s: String) {
            val context = applicationContext
            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(context, s, duration)
            toast.show()
            toast.setGravity(Gravity.CENTER, 0, 0)


        }
    }
}
