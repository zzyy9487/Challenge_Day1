package com.example.ohmygod.pry

import com.google.gson.annotations.SerializedName

data class Pry(var name:String, @SerializedName("item_name") var item_name:String) {
}