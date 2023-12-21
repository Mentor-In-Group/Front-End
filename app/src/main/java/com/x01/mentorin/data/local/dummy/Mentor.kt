package com.x01.mentorin.ui.home

data class Mentor(
    val name: String,
    val job: String,
    val imageUrl: String,
    val rating: Float,
    val education: List<Education>,
    val experience: List<Experience>,
    val schedule: List<Schedule>
)
