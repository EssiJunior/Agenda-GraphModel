package com.example.agenda_graphmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    var mActionBarToolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mActionBarToolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(mActionBarToolbar);
//        getSupportActionBar()!!.setTitle("Home");
    }
}