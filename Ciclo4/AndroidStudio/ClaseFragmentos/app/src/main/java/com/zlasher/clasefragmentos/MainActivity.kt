package com.zlasher.clasefragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA = FragmentA()
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        ft.add(R.id.fragment_container, fragmentA)
        ft.commit()

        /*ft.replace(R.id.fragment_container, fragmentB) Si quisiera reemplazar
        ft.commit()*/

    }
}