package com.latest.quotesapp

import android.content.Context
import com.google.gson.Gson
import com.latest.quotesapp.model.Quote

object DataManager {

    var data = emptyArray<Quote>()

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
    }


}