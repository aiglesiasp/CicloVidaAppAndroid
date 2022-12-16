package com.aiglesiaspubill.ciclovidaappandroid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import com.aiglesiaspubill.ciclovidaappandroid.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    companion object {
        const val TAG_NOM = "MyName"
    }
    //PRIMER PASO SE CREA
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        //SAVE INSTANCE
        //Recogemos el String o null si no hubiera
        val textAnterior = savedInstanceState?.getString(TAG_NOM)
        //Si es null creamos nuevo valor
        binding.tvView.text = textAnterior ?: Random().nextInt().toString()

        //SHARED PREFERENCES
        val sharedPreferences = getPreferences(Context.MODE_PRIVATE)
        val preferencesText = sharedPreferences.getString(TAG_NOM, "")
        println(preferencesText)

        //TOAST
        val time = System.currentTimeMillis()
        Toast.makeText(this, "$time", Toast.LENGTH_LONG).show()


        Log.d(MainActivity::class.java.simpleName, "onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
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

        val sharedPreferences = getPreferences(Context.MODE_PRIVATE)
        val editPreferences = sharedPreferences.edit()
        editPreferences.putString(TAG_NOM, "Mi Nombre")
        editPreferences.commit()
        super.onStop()
        Log.d(MainActivity::class.java.simpleName, "onStop")
    }

    //SE DESTRUYE EL ACTIVITY
    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.java.simpleName, "onDestroy")
    }




}