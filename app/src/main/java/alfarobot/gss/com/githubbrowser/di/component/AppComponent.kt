package alfarobot.gss.com.githubbrowser.di.component

import alfarobot.gss.com.githubbrowser.di.module.SharedPrefModule
import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        SharedPrefModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

}