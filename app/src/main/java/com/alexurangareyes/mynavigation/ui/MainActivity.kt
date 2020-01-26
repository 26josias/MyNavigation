package com.alexurangareyes.mynavigation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.alexurangareyes.mynavigation.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {// Up button will work on this method
        return Navigation.findNavController(this,
            R.id.nav_host_fragment
        ).navigateUp()
    }
}
