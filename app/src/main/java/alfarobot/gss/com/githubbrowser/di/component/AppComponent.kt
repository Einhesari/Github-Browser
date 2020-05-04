package alfarobot.gss.com.githubbrowser.di.component

import alfarobot.gss.com.githubbrowser.di.module.AuthRepositoryModule
import alfarobot.gss.com.githubbrowser.di.module.SharedPrefModule
import alfarobot.gss.com.githubbrowser.di.module.ViewModelModule
import alfarobot.gss.com.githubbrowser.presentation.auth.GithubWebViewFragment
import alfarobot.gss.com.githubbrowser.presentation.auth.LoginFragment
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Component(
    modules = [
        SharedPrefModule::class,
        AuthRepositoryModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    val viewModelComponentFactory: ViewModelComponent.Factory
}

@Subcomponent(
    modules = [
        ViewModelModule::class
    ]
)
interface ViewModelComponent {

    fun inject(loginFragment: LoginFragment)
    fun inject(githubWebViewFragment: GithubWebViewFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): ViewModelComponent
    }


}