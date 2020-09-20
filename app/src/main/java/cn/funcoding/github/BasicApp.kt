package cn.funcoding.github

import android.app.Application
import android.content.ContextWrapper

/**
 * Created by FangJu on 2020/8/7.
 */

private lateinit var INSTANCE: Application

class BasicApp : Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}

object AppContext : ContextWrapper(INSTANCE)