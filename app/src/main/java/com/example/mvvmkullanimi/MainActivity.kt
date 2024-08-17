package com.example.mvvmkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        enableEdgeToEdge()


        binding.textView.text="0"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun buttonToplamaTikla(){
        val alinanSayi1=binding.editTextSayiBir.text.toString()
        val alinanSayi2=binding.editTextSayi2.text.toString()

        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()


        val toplam=sayi2+sayi1
        binding.textView.text=toplam.toString()

    }
    fun buttonCarpmaTikla(){
        val alinanSayi1=binding.editTextSayiBir.text.toString()
        val alinanSayi2=binding.editTextSayi2.text.toString()

        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()


        val carpma=sayi2*sayi1
        binding.textView.text=carpma.toString()
    }
}