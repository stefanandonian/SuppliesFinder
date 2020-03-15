package com.andonian.suppliesfinder

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        constraintLayout = findViewById(R.id.login_constraint_container)
        animationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(5000)
        animationDrawable.setExitFadeDuration(2000)
    }

    override fun onResume() {
        super.onResume()
        if (!animationDrawable.isRunning)
            animationDrawable.start()
    }

    override fun onPause() {
        super.onPause()
        if (animationDrawable.isRunning)
            animationDrawable.stop()
    }
}
