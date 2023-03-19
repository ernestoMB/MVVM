package com.example.mvvm_app.data

import com.example.mvvm_app.ui.modelo.Departamentos

class DepartamentosDataDB {

    fun createListDepartamentos():List<Departamentos>{
        return listOf(
            Departamentos("Atencion al Estudiante","2222-2222","Este es el departamento de estudiantes"),
            Departamentos("Edificio R", "2222-2222","Este es la información del Edificio R"),
            Departamentos("Centro de Copias","2222-2222","Este es la informacion del centro de copias"),
            Departamentos("CDIU","2222-2222","Este es la informacion del edificio CDIU"),
            Departamentos("Colecturia","2222-2222","Esta es la informacion del departamento de Colecturia"),
            Departamentos("Magna C", "2222-2222","Esta es la informacion del  Magna C"),
            Departamentos("CITT","2222-2222", "Esta es la informacion del CITT")
        )
    }
}