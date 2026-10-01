package edu.iesam.superhero.feature.list.domain

class DeleteAlumnoUseCase(val alumnoRepository: AlumnoRepository) {

    fun invoke(dni: String) {
        alumnoRepository.deleteAlumno(dni)
    }

}