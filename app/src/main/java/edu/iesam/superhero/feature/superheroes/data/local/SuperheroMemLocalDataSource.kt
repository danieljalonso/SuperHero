package edu.iesam.superhero.feature.superheroes.data.local

import edu.iesam.superhero.feature.superheroes.domain.Superhero

class SuperheroMemLocalDataSource {

    private val localSuperheroes = mutableListOf(
        Superhero("1", "A-Bomb", "1-a-bomb", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/1-a-bomb.jpg"),
        Superhero("2", "Abe Sapien", "2-abe-sapien", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/2-abe-sapien.jpg"),
        Superhero("3", "Abin Sur", "3-abin-sur", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/3-abin-sur.jpg"),
        Superhero("4", "Abomination", "4-abomination", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/4-abomination.jpg"),
        Superhero("5", "Abraxas", "5-abraxas", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/5-abraxas.jpg"),
        Superhero("6", "Absorbing Man", "6-absorbing-man", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/6-absorbing-man.jpg"),
        Superhero("7", "Adam Monroe", "7-adam-monroe", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/7-adam-monroe.jpg"),
        Superhero("8", "Adam Strange", "8-adam-strange", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/8-adam-strange.jpg"),
        Superhero("10", "Agent Bob", "10-agent-bob", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/10-agent-bob.jpg"),
        Superhero("11", "Agent Zero", "11-agent-zero", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/11-agent-zero.jpg"),
        Superhero("12", "Air Walker", "12-air-walker", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/12-air-walker.jpg"),
        Superhero("13", "Ajax", "13-ajax", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/13-ajax.jpg"),
        Superhero("14", "Alan Scott", "14-alan-scott", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/14-alan-scott.jpg"),
        Superhero("15", "Alex Mercer", "15-alex-mercer", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/15-alex-mercer.jpg"),
        Superhero("17", "Alfred Pennyworth", "17-alfred-pennyworth", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/17-alfred-pennyworth.jpg"),
        Superhero("18", "Alien", "18-alien", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/18-alien.jpg"),
        Superhero("20", "Amazo", "20-amazo", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/20-amazo.jpg"),
        Superhero("23", "Angel", "23-angel", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/23-angel.jpg"),
        Superhero("24", "Angel", "24-angel", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/24-angel.jpg"),
        Superhero("25", "Angel Dust", "25-angel-dust", "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/25-angel-dust.jpg"),
    )

    fun save(superhero: Superhero) {
        localSuperheroes.add(superhero)
    }

    fun getAll(): List<Superhero> = localSuperheroes

    fun delete(id: String) {
        localSuperheroes.removeIf { superhero: Superhero -> superhero.id == id }
    }

}