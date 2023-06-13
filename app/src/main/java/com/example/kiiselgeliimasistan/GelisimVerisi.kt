package com.example.kiiselgeliimasistan

import android.os.Parcel
import android.os.Parcelable

data class GelisimVerisi(
    val resimId: Int,
    val ad: String,
    val altBaslik: String,
    val setsayisi: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString()?:""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(resimId)
        parcel.writeString(ad)
        parcel.writeString(altBaslik)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<GelisimVerisi> {
        override fun createFromParcel(parcel: Parcel): GelisimVerisi {
            return GelisimVerisi(parcel)
        }

        override fun newArray(size: Int): Array<GelisimVerisi?> {
            return arrayOfNulls(size)
        }
    }
}
