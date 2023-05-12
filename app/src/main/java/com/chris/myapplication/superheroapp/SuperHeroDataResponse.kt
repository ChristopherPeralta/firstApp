package com.chris.myapplication.superheroapp

import android.text.style.UpdateAppearance
import com.google.gson.annotations.SerializedName
import retrofit2.Response

data class SuperHeroDataResponse(
    @SerializedName("response") val response: String,
    @SerializedName("results") val superheroes: List<SuperheroItemResponse>
)

data class SuperheroItemResponse(
    @SerializedName("id") val superheroId: String,
    @SerializedName("name") val superheroName: String,
    @SerializedName("image") val superheroImage: SuperheroImageResponse
)

data class SuperheroImageResponse(
    @SerializedName("url") val url: String
)