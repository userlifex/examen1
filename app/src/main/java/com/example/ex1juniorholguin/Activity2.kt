package com.example.ex1juniorholguin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    companion object {
        const val NAME="NAME"
        const val EMAIL="EMAIL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val nombre = intent.getStringExtra(NAME)

        showName.setText(nombre)
    }


}