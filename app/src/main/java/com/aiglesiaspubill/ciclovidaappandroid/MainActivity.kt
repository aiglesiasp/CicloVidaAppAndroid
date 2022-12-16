package com.aiglesiaspubill.ciclovidaappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //PRIMER PASO SE CREA
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.java.simpleName, "onCreate")
    }

    //SEGUNDO PASO SE INICIA
    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.java.simpleName, "onStart")
    }

    //TERCER PASO SE EJECUTA Y EL USUARIO LA VE EN PRIMER PLANO
    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.java.simpleName, "onResume")
    }

    //REINICIAR UN ACTIVITY DESPUES DEL ONSTOP
    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity::class.java.simpleName, "onRestart")
    }

    //CUANDO EL USUARIO QUITA ESA VIEW
    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.java.simpleName, "onPause")
    }

    //CUANDO SE QUEDA ESPERANDO EL ACTIVITY A SI SE REINICIA O SE DESTRUYE
    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.java.simpleName, "onStop")
    }

    //SE DESTRUYE EL ACTIVITY
    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.java.simpleName, "onDestroy")
    }




}