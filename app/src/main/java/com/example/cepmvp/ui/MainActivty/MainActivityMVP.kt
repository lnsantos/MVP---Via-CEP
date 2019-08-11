package com.example.cepmvp.ui.MainActivty

import com.example.cepmvp.pojo.Cep

interface MainActivityMVP{

    interface Model{
        fun getCep(cep: String, call: RetrofitResult)
    }

    interface View{
        fun setResult(cep:Cep)
        fun getCep(): String
        fun setError(err:String)
    }

    interface Presenter{
        fun onFindClick()
        fun setView(v:View)
    }
}