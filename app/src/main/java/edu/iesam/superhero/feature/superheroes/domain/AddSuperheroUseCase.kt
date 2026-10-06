package edu.iesam.superhero.feature.superheroes.domain

class AddSuperheroUseCase(private val superheroRepository: SuperheroRepository) {

    fun invoke(superhero: Superhero) {
        superheroRepository.addSuperhero(superhero)
    }

}