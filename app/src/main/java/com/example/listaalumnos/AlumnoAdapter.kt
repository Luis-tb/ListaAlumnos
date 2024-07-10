package com.example.listaalumnos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlumnoAdapter(private val alumnos: List<Alumno>) :
    RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder>() {

    class AlumnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Foto: ImageView = itemView.findViewById(R.id.Foto)
        val Nombre: TextView = itemView.findViewById(R.id.txtNombre)
        val Edad: TextView = itemView.findViewById(R.id.txtEdad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_alumno, parent, false)
        return AlumnoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = alumnos[position]
        holder.Foto.setImageResource(alumno.foto)
        holder.Nombre.text = alumno.nombre
        holder.Edad.text = "Edad: ${alumno.edad}"
    }

    override fun getItemCount() = alumnos.size
}