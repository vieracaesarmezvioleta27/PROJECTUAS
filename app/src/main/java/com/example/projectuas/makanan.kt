package com.example.projectuas

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class makanan(
    val imgmakanan: Int,
    val namemakanan: String,
    val descmakanan: String,
    val desc2makanan: String,
):Parcelable
