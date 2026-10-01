package edu.iesam.superhero.feature.list.data

import edu.iesam.superhero.feature.list.domain.Alumno
import edu.iesam.superhero.feature.list.domain.AlumnoRepository

class AlumnoDataRepository(val alumnoMemLocalDataSource: AlumnoMemLocalDataSource) : AlumnoRepository{

    override fun addAlumno(alumno: Alumno) {
        alumnoMemLocalDataSource.save(alumno)
    }

    override fun getAlumnos(): ArrayList<Alumno> = alumnoMemLocalDataSource.getAll()

}