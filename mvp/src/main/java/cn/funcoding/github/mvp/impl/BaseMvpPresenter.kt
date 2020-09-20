package cn.funcoding.github.mvp.impl

import android.content.res.Configuration
import android.os.Bundle
import cn.funcoding.github.mvp.IMvpView
import cn.funcoding.github.mvp.IMvpPresenter

abstract class BaseMvpPresenter<out V : IMvpView<BaseMvpPresenter<V>>> : IMvpPresenter<V> {

    override lateinit var view: @UnsafeVariance V

    override fun onCreate(savedInstanceState: Bundle?) {

    }

    override fun onSaveInstanceState(outState: Bundle) {

    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {

    }

    override fun onConfigurationChanged(newConfig: Configuration) {

    }

    override fun onStart() {

    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onStop() {

    }

    override fun onDestroy() {

    }
}