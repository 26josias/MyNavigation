package com.alexurangareyes.mynavigation.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alexurangareyes.mynavigation.utils.Event

class HomeViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private val nameInput = MutableLiveData<Event<String>>()

    val nameUser: LiveData<Event<String>>
        get() = nameInput

    fun setInput(n: String) {
        nameInput.value =
            Event(n)
    }

    override fun onCleared() {
        super.onCleared()
        Log.w("HomeViewModel", "onCleared")
    }

    @Suppress("UNCHECKED_CAST")
    class Factory() :
        ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T =
            HomeViewModel() as T
    }

}
