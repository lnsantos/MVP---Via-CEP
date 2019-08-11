package com.example.cepmvp.ui.MainActivty

import com.example.cepmvp.retrofit.CepService
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule{

    @Provides
    fun getPresenter(model: MainActivityMVP.Model): MainActivityMVP.Presenter = MainActivityPresenter(model)

    @Provides
    fun getModel(cepService: CepService): MainActivityMVP.Model = MainActivityModel(cepService)
}