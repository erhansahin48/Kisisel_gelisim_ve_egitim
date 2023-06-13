package com.example.kiiselgeliimasistan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {
    private lateinit var imageViewDetail: ImageView
    private lateinit var tvDetail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imageViewDetail = findViewById(R.id.imageViewDetail)
        tvDetail = findViewById(R.id.tvDetail)

        val resimId = intent.getIntExtra("resimId", 0)
        val ad = intent.getStringExtra("ad")


        imageViewDetail.setImageResource(resimId)
        tvDetail.text = "$ad\n\n"
    }
}
