package com.alexurangareyes.mynavigation.ui.settings

import android.util.Log
import androidx.lifecycle.*
import com.alexurangareyes.mynavigation.utils.Event

class SettingsViewModel : ViewModel() {
    private val code = MutableLiveData<Event<Int>>()

    val postalCode: LiveData<Event<Int>> =
        Transformations.map(code) { z ->
            z
        }

    fun setInput(c: Int) {
        code.value = Event(c)
    }


    @Suppress("UNCHECKED_CAST")
    class Factory() :
        ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T =
            SettingsViewModel() as T
    }


    override fun onCleared() {
        super.onCleared()
        Log.w("SettingsViewModel", "onCleared")
    }

}
