package cn.funcoding.github.mvp

import android.content.res.Configuration
import android.os.Bundle

interface ILifecycle {
    fun onCreate(savedInstanceState: Bundle?): Unit

    fun onSaveInstanceState(outState: Bundle): Unit

    fun onViewStateRestored(savedInstanceState: Bundle?): Unit

    fun onConfigurationChanged(newConfig: Configuration): Unit

    fun onStart(): Unit

    fun onResume(): Unit

    fun onPause(): Unit

    fun onStop(): Unit

    fun onDestroy(): Unit
}