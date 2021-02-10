package com.example.artravel.wikipediaPlaces

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WikipediaService {

    @GET("radius?")
    //radius=1000&lon=24.94085264648028&lat=60.16623605171053&src_geom=wikidata&src_attr=wikidata&limit=10&apikey=5ae2e3f221c38a28845f05b63f384c730e6c086fbc1c4ea103a5c463
    fun getWikiArticles(
        @Query("radius") radius: Int,
        @Query("lon") lon: Double,
        @Query("lat") lat: Double,
        @Query("src_geom") src_geom: String,
        @Query("src_attr") src_attr: String,
        @Query("limit") action: Int,
        @Query("apikey") appid: String?,
/*        @Query("action") action: String,
        @Query("prop") prop: String,
        @Query("inprop") inprop: String,
        @Query("pithumbsize") pithumbsize: Int,
        @Query("generator") generator: String,
        @Query("ggsradius") ggsradius: Int,
        @Query("ggslimit") ggslimit: Int,
        @Query("ggscoord") ggscoord: String,
        @Query("format") format: String,*/
    ): Call<WikipediaResponse>
}