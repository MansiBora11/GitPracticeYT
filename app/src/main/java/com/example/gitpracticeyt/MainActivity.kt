package com.example.gitpracticeyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity :
    AppCompatActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(
            savedInstanceState
        )
        setContentView(
            R.layout.activity_main
        )
        println("THIS IS CONTAINED IN MY SECOND COMMIT")
        println("YouTube Branch")
        println("This line will be merged")

        println("Change 4")

    }
}