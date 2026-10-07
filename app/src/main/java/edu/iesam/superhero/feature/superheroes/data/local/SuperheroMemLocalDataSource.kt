package edu.iesam.superhero.feature.superheroes.data.local

import edu.iesam.superhero.feature.superheroes.domain.Superhero

class SuperheroMemLocalDataSource {

    private val localSuperheroes = mutableListOf(
        Superhero("1", "A-Bomb", "1-a-bomb", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/1-a-bomb.jpg"),
        Superhero("2", "Abe Sapien", "2-abe-sapien", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/2-abe-sapien.jpg"),
        Superhero("3", "Abin Sur", "3-abin-sur", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/3-abin-sur.jpg")
    )

    fun save(superhero: Superhero) {
        localSuperheroes.add(superhero)
    }

    fun getAll(): List<Superhero> = localSuperheroes

    fun delete(id: String) {
        localSuperheroes.removeIf { superhero: Superhero -> superhero.id == id }
    }

}