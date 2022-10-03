package com.omcst.library

import com.omcst.library.data.Library
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

class SeoulOpenApi {
    companion object{
        val DOMAIN = "http://openapi.seoul.go.kr:8088/"
        val API_KEY = "4b57746b6c6b676a34336c59627659"
    }
}

interface SeoulOpenService {
    @GET("{api_key}/json/SeoulPublicLibraryInfo/1/{end}")
    fun getLibraries(@Path("api_key") key:String, @Path("end") limit:Int) : Call<Library>
}