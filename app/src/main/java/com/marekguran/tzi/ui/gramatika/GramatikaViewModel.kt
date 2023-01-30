package com.marekguran.tzi.ui.gramatika

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GramatikaViewModel : ViewModel() {
    private val mText: MutableLiveData<String>

    init {
        mText = MutableLiveData()
        mText.value = "This is home fragment"
    }

    val text: LiveData<String>
        get() = mText
}