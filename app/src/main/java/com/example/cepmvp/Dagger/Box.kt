package com.example.cepmvp.Dagger

import com.example.cepmvp.retrofit.RetrofitModule
import com.example.cepmvp.ui.MainActivty.MainActivity
import com.example.cepmvp.ui.MainActivty.MainActivityModule
import dagger.Component

@Component(modules = [MainActivityModule::class, RetrofitModule::class])
interface Box{

    fun inject(mainActivity: MainActivity)
}