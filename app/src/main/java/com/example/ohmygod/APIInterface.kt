package com.example.ohmygod

import com.example.ohmygod.pry.Pry
import com.example.ohmygod.pry.Response
import com.example.ohmygod.record.Item
import retrofit2.Call
import retrofit2.http.*

interface APIInterface {

    @GET("record")
    fun getItem(
    ): Call<MutableList<Item>>

    @Headers("Content-Type: application/json","Accept: application/json")
    @POST("record")
    fun pry(
//        @Header("Content-Type") header2:String,
//        @Header("Accept") header1:String,
        @Body pry:Pry
    ): Call<Response>

}
