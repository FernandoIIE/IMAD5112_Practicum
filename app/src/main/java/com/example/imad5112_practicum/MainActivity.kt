package com.example.imad5112_practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        var titles = arrayOf("The Godfather", "The Dark Knight", "Pulp Fiction")
        var directors = arrayOf("Francis Ford Coppola", "Christopher Nolan", "Quentin Tarantino")
        var ratings = intArrayOf(10, 9, 9)
        var comments = arrayOf("Masterpiece", "Excellent", "Classic")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnViewReviews = findViewById<Button>(R.id.btnViewReviews)

        btnViewReviews.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("titles", titles)
            intent.putExtra("directors", directors)
            intent.putExtra("ratings", ratings)
            intent.putExtra("comments", comments)
            startActivity(intent)
        }
    }
}
