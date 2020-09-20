package cn.funcoding.github.mvp

interface IMvpPresenter<out View : IMvpView<IMvpPresenter<View>>> : ILifecycle {
    val view: View
}

interface IMvpView<out Presenter : IMvpPresenter<IMvpView<Presenter>>> : ILifecycle {
    val presenter: Presenter
}