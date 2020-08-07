package com.agladkov.starcraftuniverse.ui.protoss

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProtossViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is protoss Fragment"
    }
    val text: LiveData<String> = _text
}