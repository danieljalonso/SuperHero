package edu.iesam.superhero.feature.list.data

import edu.iesam.superhero.feature.list.domain.Alumno


class AlumnoMemLocalDataSource {

    val storage: ArrayList<Alumno> = ArrayList()

    fun save(alumno: Alumno) {
        storage.add(alumno)
    }

    fun getAll(): ArrayList<Alumno> = storage

    fun delete(dni: String) {
        storage.removeIf {alumno: Alumno -> alumno.dni == dni }
    }

}