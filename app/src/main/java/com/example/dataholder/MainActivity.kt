package com.example.dataholder

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.databinding.DataBindingUtil
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.dataholder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mycount:Mainmodel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        mycount=ViewModelProvider(this).get(Mainmodel::class.java)
        binding.textView.text=mycount.getCurrentCount().toString()

        binding.apply {
            button.setOnClickListener(){
              textView.text=mycount.getUpdateCounter().toString()
            }
        }
    }
}