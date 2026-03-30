package com.example.project1st10520477

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val editText = findViewById<EditText>(R.id.editTextText)   //Line 15-17 helps my app interact with the UI and it's layout
        val button = findViewById<Button>(R.id.buttonSubmit)
        val textView = findViewById<TextView>(R.id.textviewResult)

        button.setOnClickListener {
            val input = editText.text.toString().trim().lowercase() // This helps with what the user whats to input into the editText

            val message = when (input){
                "morning" -> "Time to text the fam Good morning!"  //Line 23-28 is when the input being the edit contains any of these words which will change the text inside the textVIew
                "mid-morning", "mid morning" -> "Maybe text a friend?"
                "afternoon" -> "Try phone calling a friend and talk about the day "
                "evening" -> "Leave a like or comment on a friend's post"
                "night" -> "Post story!"
                else -> "Invalid input"
            }
            textView.text = message // This is where the messages will displayed be when the input is given in the editText
        }





        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}