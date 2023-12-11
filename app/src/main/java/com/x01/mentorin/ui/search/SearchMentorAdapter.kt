package com.x01.mentorin.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.x01.mentorin.R
import com.x01.mentorin.ui.home.Mentor

class SearchMentorAdapter(private val mentor: List<Mentor>): RecyclerView.Adapter<SearchMentorAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.mentor_name)
        val job: TextView = itemView.findViewById(R.id.mentor_job)
        val rating: TextView = itemView.findViewById(R.id.mentor_rating)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.mentor_search_result, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mentor.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mentor = mentor[position]

        holder.name.text = mentor.name
        holder.job.text = mentor.job
        holder.rating.text = mentor.rating.toString()

//        Glide.with(context)
//            .load(mentor.imageUrl)
//            .into(holder.imageUrl)


    }
}