package edu.iesam.superhero.feature.list.domain

interface AlumnoRepository {

    fun addAlumno(alumno: Alumno)

    fun getAlumnos(): ArrayList<Alumno>

}