package com.example.ex1juniorholguin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var nombre=""
    var email=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_option, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {

        R.id.nextView -> {
            val i= Intent(this,Activity2::class.java)
            i.putExtra(Activity2.NAME,nombre)
            i.putExtra(Activity2.EMAIL,email)
            this.startActivity(i)
            true
        }else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    fun goBack() {
        this.finish()
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