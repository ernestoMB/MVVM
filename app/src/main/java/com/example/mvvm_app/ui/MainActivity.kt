package com.example.mvvm_app.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm_app.R
import com.example.mvvm_app.ui.modelo.Departamentos
import com.example.mvvm_app.viewmodel.MyViewModel


class MainActivity : AppCompatActivity() {

    private  lateinit var  viewModel:MyViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        val DepartamentosObserver = Observer<List<Departamentos>>{
            for(depa in it)
            {
                Log.d("Departamentos", depa.NombreDepartamentos+"  "+depa.InformacionDepartamento)
            }
            for((index,value) in it.withIndex()) {

                Log.d(
                    "Departamento:$index ",
                    value.NombreDepartamentos + value.InformacionDepartamento + value.TelefonoDepartamento
                )

            }

        }

        viewModel.getListaDepartamentosLiveData().observe(this,DepartamentosObserver)
    }
}