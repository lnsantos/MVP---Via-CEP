package com.example.cepmvp.retrofit

import dagger.Module
import dagger.Provides

@Module
class RetrofitModule {

    @Provides
    fun getCepService():CepService = RetrofitInstance.getCepService()
}