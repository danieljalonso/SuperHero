package edu.iesam.superhero.feature.superheroes.data

import edu.iesam.superhero.feature.superheroes.data.local.SuperheroMemLocalDataSource
import edu.iesam.superhero.feature.superheroes.domain.Superhero
import edu.iesam.superhero.feature.superheroes.domain.SuperheroRepository

class SuperheroDataRepository(private val superheroMemLocalDataSource: SuperheroMemLocalDataSource) : SuperheroRepository {

    override fun addSuperhero(superhero: Superhero) {
        superheroMemLocalDataSource.save(superhero)
    }

}