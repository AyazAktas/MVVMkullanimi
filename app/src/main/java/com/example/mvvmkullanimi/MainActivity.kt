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
        binding.mainActivityNesnesi=this
        enableEdgeToEdge()


        binding.hesaplamaSonucu="0"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun buttonToplamaTikla(alinanSayi1:String,alinanSayi2:String){
        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()
        val toplam=sayi2+sayi1
        binding.hesaplamaSonucu=toplam.toString()

    }
    fun buttonCarpmaTikla(alinanSayi1:String,alinanSayi2:String){
        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()
        val carpma=sayi2*sayi1
        binding.hesaplamaSonucu=carpma.toString()
    }
}