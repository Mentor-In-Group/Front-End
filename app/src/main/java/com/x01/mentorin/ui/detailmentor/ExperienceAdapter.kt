package com.x01.mentorin.ui.detailmentor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.x01.mentorin.R
import com.x01.mentorin.ui.home.Education
import com.x01.mentorin.ui.home.Experience

class ExperienceAdapter(private val experience: List<Experience>): RecyclerView.Adapter<ExperienceAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val job: TextView = itemView.findViewById(R.id.tv_job)
        val company: TextView = itemView.findViewById(R.id.company)
        val workDate: TextView = itemView.findViewById(R.id.work_date)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.experience, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return experience.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val education = experience[position]

        holder.job.text = education.job
        holder.company.text = education.company
        holder.workDate.text = education.workDate

//        Glide.with(context)
//            .load(mentor.imageUrl)
//            .into(holder.imageUrl)


    }
}