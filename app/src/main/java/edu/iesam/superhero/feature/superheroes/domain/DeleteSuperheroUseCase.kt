package edu.iesam.superhero.feature.superheroes.domain

class DeleteSuperheroUseCase(private val superheroRepository: SuperheroRepository) {

    fun invoke(id: String) {
        superheroRepository.deleteSuperhero(id)
    }

}