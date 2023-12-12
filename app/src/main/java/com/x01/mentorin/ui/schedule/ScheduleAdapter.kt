package com.x01.mentorin.ui.schedule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.x01.mentorin.R
import com.x01.mentorin.ui.home.Mentor
import com.x01.mentorin.ui.home.Schedule
import com.x01.mentorin.ui.search.SearchMentorAdapter

class ScheduleAdapter (private val schedule: List<Schedule>): RecyclerView.Adapter<ScheduleAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val mentorName: TextView = itemView.findViewById(R.id.mentor_name)
        val mentorImage: ImageView = itemView.findViewById(R.id.mentor_image)
        val mentoringTime: TextView = itemView.findViewById(R.id.mentoring_time)
        val mentoringDate: TextView = itemView.findViewById(R.id.mentoring_date)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.schedule, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return schedule.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val schedule = schedule[position]

        holder.mentorName.text = schedule.mentorName
        holder.mentoringDate.text = schedule.mentoringDate
        holder.mentoringTime.text = schedule.mentoringTime
        holder.mentorImage.setImageResource(R.drawable.image_recommend_1)



//        Glide.with(context)
//            .load(mentor.imageUrl)
//            .into(holder.imageUrl)


    }
}