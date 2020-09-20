package cn.funcoding.github

import cn.funcoding.github.common.Preferences

/**
 * Created by FangJu on 2020/8/7.
 */
object Setting {
    var email: String by Preferences(AppContext, "email", "")
    var password: String by Preferences(AppContext, "password", "")
}