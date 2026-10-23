package com.jarvis.app

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val texto = TextView(this)
        texto.text = "J.A.R.V.I.S.\nSistema en línea"
        texto.textSize = 28f
        texto.gravity = Gravity.CENTER
        texto.setTextColor(Color.parseColor("#00E5FF"))
        texto.setBackgroundColor(Color.parseColor("#04111F"))
        setContentView(texto)
    }
}
