package com.example.hwcustomview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.view.View
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<StatsView>(R.id.stats)
        view.data = listOf(
            0.25F,
            0.25F,
            0.25F,
            0.25F,
        )
    }
}
