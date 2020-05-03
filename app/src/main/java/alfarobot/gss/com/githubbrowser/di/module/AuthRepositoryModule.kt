package alfarobot.gss.com.githubbrowser.di.module

import alfarobot.gss.com.githubbrowser.data.datasource.prefrences.SharedPrefsDataSource
import alfarobot.gss.com.githubbrowser.data.repository.AuthRepositoryImpl
import alfarobot.gss.com.githubbrowser.domain.repository.AuthRepository
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AuthRepositoryModule {

    @Provides
    fun provideAuthRepo(
        context: Context,
        sharedPrefsDataSource: SharedPrefsDataSource
    ): AuthRepository {
        return AuthRepositoryImpl(sharedPrefsDataSource, context)
    }
}