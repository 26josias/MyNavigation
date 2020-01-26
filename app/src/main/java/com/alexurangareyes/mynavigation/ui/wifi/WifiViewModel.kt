package com.alexurangareyes.mynavigation.ui.wifi

import android.util.Log
import androidx.lifecycle.ViewModel

class WifiViewModel : ViewModel() {
    override fun onCleared() {
        super.onCleared()
        Log.w("WifiViewModel", "onCleared")
    }
}
