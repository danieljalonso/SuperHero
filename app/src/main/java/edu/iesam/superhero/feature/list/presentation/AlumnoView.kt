package edu.iesam.superhero.feature.list.presentation

import edu.iesam.superhero.feature.list.data.AlumnoDataRepository
import edu.iesam.superhero.feature.list.data.AlumnoMemLocalDataSource
import edu.iesam.superhero.feature.list.domain.AddAlumnoUseCase
import edu.iesam.superhero.feature.list.domain.Alumno
import edu.iesam.superhero.feature.list.domain.DeleteAlumnoUseCase
import edu.iesam.superhero.feature.list.domain.GetAlumnosUseCase

class AlumnoView {

    fun addAlumno() {
        var alumno = Alumno("Daniel", "Jimenez Alonso", "12345678A")

        val addAlumnoUseCase = AddAlumnoUseCase(AlumnoDataRepository(AlumnoMemLocalDataSource))

        addAlumnoUseCase.invoke(alumno)
    }

    fun deleteAlumno() {
        var dni = "12345678A"

        val deleteAlumnoUseCase = DeleteAlumnoUseCase(AlumnoDataRepository(AlumnoMemLocalDataSource))

        deleteAlumnoUseCase.invoke(dni)
    }

    fun getAlumnos(): ArrayList<Alumno> {
        val getAlumnoUseCase = GetAlumnosUseCase(AlumnoDataRepository(AlumnoMemLocalDataSource))

        return getAlumnoUseCase.invoke()
    }

}