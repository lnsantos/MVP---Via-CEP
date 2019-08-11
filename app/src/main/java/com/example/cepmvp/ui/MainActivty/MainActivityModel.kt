package com.example.cepmvp.ui.MainActivty

import com.example.cepmvp.pojo.Cep
import com.example.cepmvp.retrofit.CepService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityModel(val cepService: CepService) : MainActivityMVP.Model {

    override fun getCep(cep: String, callRetro: RetrofitResult) {

        cepService.getCep(cep).enqueue(object : Callback<Cep> {

            override fun onFailure(call: Call<Cep>, t: Throwable) {

            }

            override fun onResponse(call: Call<Cep>, response: Response<Cep>) {

                if (response.isSuccessful) {

                    callRetro.onResult(response.body()!!)
                }
            }

        })
    }
}