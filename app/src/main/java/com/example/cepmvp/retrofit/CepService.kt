package com.example.cepmvp.retrofit

import com.example.cepmvp.pojo.Cep
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CepService {

    @GET("{cep}/json/")
    fun getCep(@Path("cep") cep: String): Call<Cep>
}