package com.appsneakers.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val sepatu: String = "",
    val foto: String = "",
    val tipe: String = "",
    val merk: String = ""
) : Parcelable
