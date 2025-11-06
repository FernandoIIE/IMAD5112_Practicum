package com.example.imad5112_practicum

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val layoutContainer = findViewById<LinearLayout>(R.id.layoutContainer)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Recebe dados enviados pela MainActivity
        val titles = intent.getStringArrayExtra("titles") ?: arrayOf()
        val directors = intent.getStringArrayExtra("directors") ?: arrayOf()
        val ratings = intent.getIntArrayExtra("ratings") ?: intArrayOf()
        val comments = intent.getStringArrayExtra("comments") ?: arrayOf()

        // Cria card para cada filme
        for (i in titles.indices) {
            val card = CardView(this).apply {
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                ).apply { setMargins(0, 0, 0, 16) }
                radius = 12f
                setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                cardElevation = 8f
                useCompatPadding = true
            }

            val textView = TextView(this).apply {
                text = "Title: ${titles[i]}\nDirector: ${directors[i]}\nRating: ${ratings[i]}\nComment: ${comments[i]}"
                textSize = 16f
                setPadding(16, 16, 16, 16)
            }

            card.addView(textView)
            layoutContainer.addView(card, layoutContainer.indexOfChild(btnBack))
        }

        // Volta para MainActivity
        btnBack.setOnClickListener { finish() }
    }
}
