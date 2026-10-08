package edu.iesam.superhero.feature.superheroes.presentacion

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.superhero.R
import coil3.load

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

        val viewModel = SuperheroListViewModel()

        val container = findViewById<LinearLayout>(R.id.rows)

        for (superhero in viewModel.getSuperheroes()) {

            val view = layoutInflater.inflate(
                R.layout.superhero_list,
                container,
                false
            )

            val name = view.findViewById<TextView>(R.id.name)
            val slug = view.findViewById<TextView>(R.id.slug)
            val image = view.findViewById<ImageView>(R.id.superheroImage)

            name.text = superhero.name
            slug.text = superhero.slug
            image.load(superhero.image)

            container.addView(view)

        }

    }

}