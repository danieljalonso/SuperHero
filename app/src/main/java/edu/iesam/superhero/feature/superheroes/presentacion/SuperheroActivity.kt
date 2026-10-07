package edu.iesam.superhero.feature.superheroes.presentacion

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.superhero.R
import edu.iesam.superhero.feature.superheroes.data.SuperheroDataRepository
import edu.iesam.superhero.feature.superheroes.data.local.SuperheroMemLocalDataSource
import edu.iesam.superhero.feature.superheroes.domain.GetSuperheroesUseCase
import edu.iesam.superhero.feature.users.data.UserDataRepository
import edu.iesam.superhero.feature.users.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.users.domain.GetUsersUseCase
import edu.iesam.superhero.feature.users.presentation.ListViewModel

class SuperheroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_superhero)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listViewModel =
            ListViewModel(GetSuperheroesUseCase(SuperheroDataRepository(SuperheroMemLocalDataSource())))

        val inputName = findViewById<TextView>(R.id.input_name)
        inputName.text = listViewModel.getSuperheroes().first().name

    }

}