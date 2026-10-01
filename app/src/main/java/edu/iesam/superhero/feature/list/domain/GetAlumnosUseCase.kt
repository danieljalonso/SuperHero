package edu.iesam.superhero.feature.list.domain

class GetAlumnosUseCase(val alumnoRepository: AlumnoRepository) {

    fun invoke(): ArrayList<Alumno> = alumnoRepository.getAlumnos()

}