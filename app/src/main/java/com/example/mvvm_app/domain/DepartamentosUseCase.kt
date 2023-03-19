package com.example.mvvm_app.domain

import com.example.mvvm_app.data.DepartamentosDataDB
import com.example.mvvm_app.ui.modelo.Departamentos

class DepartamentosUseCase {

    val departamentosDataDB= DepartamentosDataDB()

    fun getListaDespartamentos():List<Departamentos>{
        return departamentosDataDB.createListDepartamentos()
    }
}