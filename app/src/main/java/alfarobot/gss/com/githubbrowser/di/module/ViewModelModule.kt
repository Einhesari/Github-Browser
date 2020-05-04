package alfarobot.gss.com.githubbrowser.di.module

import alfarobot.gss.com.githubbrowser.ViewModelProviderFactory
import alfarobot.gss.com.githubbrowser.di.scope.ViewModelKey
import alfarobot.gss.com.githubbrowser.presentation.auth.AuthViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel
}