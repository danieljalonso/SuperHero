package edu.iesam.superhero.feature.superheroes.data.local

import edu.iesam.superhero.feature.superheroes.domain.Superhero

class SuperheroMemLocalDataSource {

    private val localSuperheroes = mutableListOf(
        Superhero("1", "A-Bomb", "1-a-bomb", ""),
        Superhero("2", "Abe Sapien", "2-abe-sapien", ""),
        Superhero("3", "Abin Sur", "3-abin-sur", "")
    )

    fun save(superhero: Superhero) {
        localSuperheroes.add(superhero)
    }

}