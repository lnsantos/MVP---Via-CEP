package com.example.cepmvp.ui.MainActivty

import com.example.cepmvp.pojo.Cep

class MainActivityPresenter(val model: MainActivityMVP.Model) : MainActivityMVP.Presenter, RetrofitResult {

    lateinit var gView: MainActivityMVP.View

    override fun setView(v: MainActivityMVP.View) {
        gView = v
    }

    override fun onFindClick() {
        val result = gView.getCep()

        if (result.isBlank())
        {
            gView.setError("Infelizmente os campos estão vazios")
        }
        else
        {
            model.getCep(result,this)
        }

    }

    override fun onResult(cep: Cep) {
        gView.setResult(cep)
    }
}


interface RetrofitResult{
    fun onResult(cep: Cep)
}
