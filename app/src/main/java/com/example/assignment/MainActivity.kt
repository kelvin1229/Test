package com.example.assignment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.walletmain)



    }
    fun topupBtn(view: View) {
        val intent = Intent(this, wallet::class.java)
        startActivity(intent)
    }



}