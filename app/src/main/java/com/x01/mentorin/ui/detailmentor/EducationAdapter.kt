package com.x01.mentorin.ui.detailmentor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.x01.mentorin.R
import com.x01.mentorin.ui.home.Education
import com.x01.mentorin.ui.home.Mentor
import com.x01.mentorin.ui.home.MentorAdapter

class EducationAdapter(private val education: List<Education>): RecyclerView.Adapter<EducationAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val programStudy: TextView = itemView.findViewById(R.id.program_study)
        val university: TextView = itemView.findViewById(R.id.university)
        val graduationDate: TextView = itemView.findViewById(R.id.graduation_date)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.education, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return education.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val education = education[position]

        holder.programStudy.text = education.programStudy
        holder.university.text = education.university
        holder.graduationDate.text = education.graduationDate

//        Glide.with(context)
//            .load(mentor.imageUrl)
//            .into(holder.imageUrl)


    }
}