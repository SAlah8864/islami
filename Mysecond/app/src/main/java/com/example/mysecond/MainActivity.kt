package com.example.mysecond

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat.startActivity
import com.example.mysecond.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list_view.*
import kotlinx.android.synthetic.main.text_watcher.*
import java.net.URI
import java.net.URL

class MainActivity : AppCompatActivity() {
    val fruit= arrayOf("apple","bananna","peach","watermelon","lemons","apple","bananna","peach","watermelon","lemons")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



val myadapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruit)
        mylist.adapter=myadapter
  mylist.setOnItemClickListener { _, view, position, l ->
      val textview=view as TextView
      when (position){
          0->{Toast.makeText(this,textview.text.toString(),Toast.LENGTH_LONG).show()}
          1->{Toast.makeText(this,textview.text.toString(),Toast.LENGTH_LONG).show()}
          2->{Toast.makeText(this,textview.text.toString(),Toast.LENGTH_LONG).show()}
          3->{Toast.makeText(this,textview.text.toString(),Toast.LENGTH_LONG).show()}

      }

  }

    }

}







