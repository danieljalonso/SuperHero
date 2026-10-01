package edu.iesam.superhero.feature.list.domain

class AddAlumnoUseCase(val alumnoRepository: AlumnoRepository) {

    fun invoke(alumno: Alumno) {
        alumnoRepository.addAlumno(alumno)
    }

}