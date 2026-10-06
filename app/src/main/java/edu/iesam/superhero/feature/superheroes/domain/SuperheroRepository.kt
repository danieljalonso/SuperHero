package edu.iesam.superhero.feature.superheroes.domain

interface SuperheroRepository {

    fun addSuperhero(superhero: Superhero)

    fun getSuperheroes(): List<Superhero>

}