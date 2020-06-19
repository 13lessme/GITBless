package com.example.blessnews

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemOfList(
    val imageSrc: Int,
            val imageTitle: String,
                    val imageDesc: String
) : Parcelable
