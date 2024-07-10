package com.example.listaalumnos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val alumnos = listOf(
            Alumno("Jhan Pérez", 20, R.drawable.img),
            Alumno("Luis López", 22, R.drawable.img_1),
            Alumno("Julio García", 21, R.drawable.img_2)
        )
        val adapter = AlumnoAdapter(alumnos)
        recyclerView.adapter = adapter
    }
}