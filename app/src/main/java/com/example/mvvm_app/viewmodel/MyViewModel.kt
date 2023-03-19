package com.example.mvvm_app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_app.domain.DepartamentosUseCase
import com.example.mvvm_app.ui.modelo.Departamentos

class MyViewModel:ViewModel() {

    private val listData = MutableLiveData<List<Departamentos>>()

    val Departamentosusecase = DepartamentosUseCase()

    init {
        getListaDepartamentos()
    }



    fun setListDataDepartamentos(ListaDepartamentos:List<Departamentos>){
        listData.value = ListaDepartamentos
    }

    fun getListaDepartamentos(){
        setListDataDepartamentos(Departamentosusecase.getListaDespartamentos())
    }

    fun getListaDepartamentosLiveData():LiveData<List<Departamentos>>{
        return listData
    }

}