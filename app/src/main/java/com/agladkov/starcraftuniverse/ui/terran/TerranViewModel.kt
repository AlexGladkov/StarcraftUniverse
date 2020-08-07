package com.agladkov.starcraftuniverse.ui.terran

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TerranViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is terran Fragment"
    }
    val text: LiveData<String> = _text
}