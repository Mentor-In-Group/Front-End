package com.x01.mentorin

import android.animation.ObjectAnimator
import android.view.View
import android.widget.ImageView
import com.x01.mentorin.ui.home.Education
import com.x01.mentorin.ui.home.Experience
import com.x01.mentorin.ui.home.Mentor

fun playAnimation(image: ImageView){
    ObjectAnimator.ofFloat(image, View.TRANSLATION_X, -30f, 30f).apply {
        duration = 6000
        repeatCount = ObjectAnimator.INFINITE
        repeatMode = ObjectAnimator.REVERSE
    }.start()
}

fun nameValidation(name: String): Boolean{
    return name.isNotEmpty()
}

fun jobValidation(job: String): Boolean{
    return job.isNotEmpty()
}
fun emailValidation(email: String): Boolean{
    val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex()
    return email.matches(emailPattern)
}

fun passwordValidation(password:String): Boolean{
    return password.length >= 8
}

val listMentor: List<Mentor> = listOf<Mentor>(
    Mentor(
        "Fadil Hijayat",
        "Project Manager",
        "https://images.unsplash.com/photo-1480429370139-e0132c086e2a?q=80&w=1976&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        4.8F,
        listOf(
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            )
        ),
        listOf(
            Experience(
                "Senior Project Manager",
                "PT. ABC",
                "2010 - present"
            )
        ),

    ),
    Mentor(
        "Fadil Hijayat",
        "Project Manager",
        "https://images.unsplash.com/photo-1480429370139-e0132c086e2a?q=80&w=1976&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        4.8F,
        listOf(
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            )
        ),
        listOf(
            Experience(
                "Senior Project Manager",
                "PT. ABC",
                "2010 - present"
            )
        ),
    ),
    Mentor(
        "Fadil Hijayat",
        "Project Manager",
        "https://images.unsplash.com/photo-1480429370139-e0132c086e2a?q=80&w=1976&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        4.8F,
        listOf(
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            )
        ),
        listOf(
            Experience(
                "Senior Project Manager",
                "PT. ABC",
                "2010 - present"
            )
        ),
    ),
    Mentor(
        "Fadil Hijayat",
        "Project Manager",
        "https://images.unsplash.com/photo-1480429370139-e0132c086e2a?q=80&w=1976&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        4.8F,
        listOf(
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            )
        ),
        listOf(
            Experience(
                "Senior Project Manager",
                "PT. ABC",
                "2010 - present"
            )
        ),
    ),
    Mentor(
        "Fadil Hijayat",
        "Project Manager",
        "https://images.unsplash.com/photo-1480429370139-e0132c086e2a?q=80&w=1976&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        4.8F,
        listOf(
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            )
        ),
        listOf(
            Experience(
                "Senior Project Manager",
                "PT. ABC",
                "2010 - present"
            )
        ),
    ),
    Mentor(
        "Fadil Hijayat",
        "Project Manager",
        "https://images.unsplash.com/photo-1480429370139-e0132c086e2a?q=80&w=1976&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        4.8F,
        listOf(
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            ),
            Education(
                "Information System",
                "Stamford University",
                "12 May - 8 July 2005"
            )
        ),
        listOf(
            Experience(
                "Senior Project Manager",
                "PT. ABC",
                "2010 - present"
            )
        ),
    ),
)