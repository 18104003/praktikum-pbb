package com.aji_18104003.modul6s
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyData(
        var name : String,
        var description : String,
        var photo : String
) : Parcelable