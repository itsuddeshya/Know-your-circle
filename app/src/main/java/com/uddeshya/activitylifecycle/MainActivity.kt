package com.uddeshya.activitylifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var titleName : String?= "name"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)

        if (intent !=null)
        {
            titleName = intent.getStringExtra("Name")
        }

        title= "titleName"
    }
}
