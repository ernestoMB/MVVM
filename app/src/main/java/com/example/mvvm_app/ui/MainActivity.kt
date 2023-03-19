package com.example.mvvm_app.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm_app.R
import com.example.mvvm_app.ui.modelo.Departamentos
import com.example.mvvm_app.viewmodel.MyViewModel


class MainActivity : AppCompatActivity() {

    private  lateinit var  viewModel:MyViewModel
    private lateinit var container: LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        container = findViewById(R.id.container)

        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        val DepartamentosObserver = Observer<List<Departamentos>>{
            /*for(depa in it)
            {
                Log.d("Departamentos", depa.NombreDepartamentos+"  "+depa.InformacionDepartamento)
            }*/
            for((index,value) in it.withIndex()) {

                /*Log.d(
                    "Departamento:$index ",
                    value.NombreDepartamentos + value.InformacionDepartamento + value.TelefonoDepartamento
                )*/

                val button = Button(this)
                button.text = value.NombreDepartamentos
                button.setOnClickListener{
                    val intent = Intent(this,DetalleRegistro::class.java)
                    intent.putExtra("nombre",value.NombreDepartamentos)
                    intent.putExtra("telefono",value.TelefonoDepartamento)
                    intent.putExtra("informacion",value.InformacionDepartamento)
                    startActivity(intent)
                }
                container.addView(button)

            }

        }

        viewModel.getListaDepartamentosLiveData().observe(this,DepartamentosObserver)
    }
}