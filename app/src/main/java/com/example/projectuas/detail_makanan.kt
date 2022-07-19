package com.example.projectuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detail_makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)

        supportActionBar?.title = "Biodata Lengkap makanan"

        val makanan = intent.getParcelableExtra<makanan>(MainActivity.INTENT_PARCELABLE)

        val imgmakanan = findViewById<ImageView>(R.id.img_item_photo)
        val namemakanan = findViewById<TextView>(R.id.tv_item_name)
        val descmakanan = findViewById<TextView>(R.id.tv_item_description)
        val desc2makanan = findViewById<TextView>(R.id.tv_item_description2)

        imgmakanan.setImageResource(makanan?.imgmakanan!!)
        namemakanan.text = makanan.namemakanan
        descmakanan.text = makanan.descmakanan
        desc2makanan.text = makanan.desc2makanan
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }

}