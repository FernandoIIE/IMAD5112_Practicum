# imad5112w-practicum-FernandoIIE
imad5112w-practicum-FernandoIIE created by GitHub Classroom

# IMAD5112 Practicum - Movie Reviews App

This project is a simple Android application developed in Kotlin that allows users to view movie information and reviews. The app was built as part of the practical exercise for the IMAD5112 course and makes use of arrays, loops, and screen navigation.

---

## Features

The app has two main screens:

1. **MainActivity**  
   - Displays a button to access movie details.  
   - Uses parallel arrays to store movie information:
     - `titles` – Movie titles  
     - `director` – Movie directors  
     - `ratings` – Movie ratings (1-5)  
     - `comments` – User comments  

   When the **"View Reviews"** button is clicked, the movie data is sent to the second screen (`DetailActivity`) via an `Intent`.

2. **DetailActivity**  
   - Receives the arrays sent from `MainActivity`.  
   - Dynamically displays details of each movie in a `LinearLayout` using a loop.  
   - Each movie shows:
     - Title
     - Director
     - Rating
     - Comment

---

## Technologies Used

- **Language:** Kotlin  
- **IDE:** Android Studio  
- **Components:**  
  - `Button` for navigation  
  - `LinearLayout` to display movie details  
  - `TextView` to show information for each movie  

---

## Code Structure

### MainActivity.kt
```kotlin
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


<img width="548" height="1069" alt="image" src="https://github.com/user-attachments/assets/329b4c16-b639-40a8-91d7-93cab727f90f" />
<img width="481" height="941" alt="image" src="https://github.com/user-attachments/assets/9b95088a-1e60-47d3-b906-e415b1974a52" />
`
<img width="940" height="586" alt="image" src="https://github.com/user-attachments/assets/cc9e4706-9565-493c-917c-c020aeb5dea4" />

