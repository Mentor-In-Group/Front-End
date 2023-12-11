package com.x01.mentorin.ui.home

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.x01.mentorin.R
import com.x01.mentorin.ui.BottomNavigation

class MentorAdapter(private val mentors: List<Mentor>,private val context: Context): RecyclerView.Adapter<MentorAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.mentor_name)
        val job: TextView = itemView.findViewById(R.id.mentor_job)
        val imageUrl: ImageView = itemView.findViewById(R.id.mentor_image)
        val rating: TextView = itemView.findViewById(R.id.mentor_rating)
        val mentorLayout:ConstraintLayout = itemView.findViewById(R.id.mentor)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.mentor, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mentors.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mentor = mentors[position]

        holder.name.text = mentor.name
        holder.job.text = mentor.job
        holder.rating.text = mentor.rating.toString()
        holder.imageUrl.setImageResource(R.drawable.image_recommend_2)

        holder.mentorLayout.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_navigation_home_to_detailMentorActivity)

        }
//        Glide.with(context)
//            .load(mentor.imageUrl)
//            .into(holder.imageUrl)


    }
}