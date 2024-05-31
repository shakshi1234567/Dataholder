package com.example.dataholder

import androidx.lifecycle.ViewModel
class Mainmodel:ViewModel(){
    private var counter=0
    fun getCurrentCount():Int{
        return counter
    }
    fun getUpdateCounter():Int{
        return ++counter
    }
}
