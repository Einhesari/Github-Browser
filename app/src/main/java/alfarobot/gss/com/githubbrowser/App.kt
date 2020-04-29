package alfarobot.gss.com.githubbrowser

import alfarobot.gss.com.githubbrowser.di.component.AppComponent
import alfarobot.gss.com.githubbrowser.di.component.DaggerAppComponent
import android.app.Application

class App : Application() {

    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.factory().create(this)
    }
}