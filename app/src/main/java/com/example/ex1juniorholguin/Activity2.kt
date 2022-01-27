package com.example.ex1juniorholguin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_option_2, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.back -> {
            goBack()
            true
        }

        else -> {
// If we got here, the user's action was not recognized.
// Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    fun goBack() {
        this.finish()
    }


}