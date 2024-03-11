package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener{
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val btnEducation = findViewById<Button>(R.id.btnEducation)
        btnEducation.setOnClickListener{
            intent = Intent( this, Education::class.java)
            startActivity(intent)
        }

        val btnWork = findViewById<Button>(R.id.btnWork)
        btnWork.setOnClickListener {
            intent = Intent(this, Work::class.java)
            startActivity(intent)
        }

        val btnExperience = findViewById<Button>(R.id.btnExperience)
        btnExperience.setOnClickListener {
            intent = Intent(this, Experience::class.java)
            startActivity(intent)
        }
    }
}