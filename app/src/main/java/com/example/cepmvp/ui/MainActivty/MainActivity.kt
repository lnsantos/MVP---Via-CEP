package com.example.cepmvp.ui.MainActivty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.cepmvp.Dagger.DaggerBox
import com.example.cepmvp.R
import com.example.cepmvp.pojo.Cep
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityMVP.View {

    @Inject
    lateinit var presenter : MainActivityMVP.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerBox.create().inject(this) //config dagger

        button.setOnClickListener{
            presenter.onFindClick()
        }

        presenter.setView(this)
    }

    override fun setResult(cep: Cep) {

    }

    override fun getCep(): String = editText.text.toString()


    override fun setError(err: String) {
        Toast.makeText(this, "" + err, Toast.LENGTH_LONG).show()
    }
}
