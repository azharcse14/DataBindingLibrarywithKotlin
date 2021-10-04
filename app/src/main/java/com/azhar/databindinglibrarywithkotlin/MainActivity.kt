package com.azhar.databindinglibrarywithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.azhar.databindinglibrarywithkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var maniBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        maniBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var userModel = UserModel()
        userModel.uName = "Androidian"
        userModel.pwd = "123456"
        maniBinding.userModel = userModel
    }
}