package com.example.mvvm_app.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mvvm_app.R

class DetalleRegistro : AppCompatActivity() {

    private lateinit var tvNombre: TextView
    private lateinit var tvTelefono: TextView
    private lateinit var tvInformacion: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_registro)
        val nombre = intent.getStringExtra("nombre")
        val telefono = intent.getStringExtra("telefono")
        val informacion = intent.getStringExtra("informacion")

        tvNombre = findViewById(R.id.tvNombre)
        tvTelefono = findViewById(R.id.tvTelefono)
        tvInformacion = findViewById(R.id.tvInformacion)

        tvNombre.setText(nombre)
        tvTelefono.setText(telefono)
        tvInformacion.setText(informacion)

    }
}