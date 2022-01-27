package com.example.ex1juniorholguin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var nombre=""
    var email=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jugar(view: View){
        nombre = inputName.text.toString();
        email = inputEmail.text.toString();
        val i= Intent(this, Activity2::class.java)
        i.putExtra(Activity2.NAME, nombre)
        i.putExtra(Activity2.EMAIL, email)
        this.startActivity(i)
    }
}