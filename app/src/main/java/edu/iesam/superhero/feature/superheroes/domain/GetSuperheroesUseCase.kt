package edu.iesam.superhero.feature.superheroes.domain

class GetSuperheroesUseCase(private val superheroRepository: SuperheroRepository) {

    fun invoke(): List<Superhero> = superheroRepository.getSuperheroes()

}