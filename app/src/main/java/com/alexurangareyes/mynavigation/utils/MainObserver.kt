package com.alexurangareyes.mynavigation.utils

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent


class MainObserver(private val lifecycleOwner: LifecycleOwner) : LifecycleObserver {

    private val TAG = MainObserver::class.java.simpleName

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i(TAG, "Observer onCreate Called")
        Log.i(TAG, "Lifecycle State is : ${lifecycleOwner.lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.i(TAG, "Observer onStart Called")
        Log.i(TAG, "Lifecycle State is : ${lifecycleOwner.lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.i(TAG, "Observer onResume Called")
        Log.i(TAG, "Lifecycle State is : ${lifecycleOwner.lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.i(TAG, "Observer onPause Called")
        Log.i(TAG, "Lifecycle State is : ${lifecycleOwner.lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.i(TAG, "Observer onStop Called")
        Log.i(TAG, "Lifecycle State is : ${lifecycleOwner.lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.e(TAG, "Observer onDestroy Called")
        Log.e(TAG, "Lifecycle State is : ${lifecycleOwner.lifecycle.currentState}")
    }
}