package com.example.MADPractical10_20012011035

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.MADPractical10_20012011035.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bt1.setOnClickListener{
            var intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }



    }
}