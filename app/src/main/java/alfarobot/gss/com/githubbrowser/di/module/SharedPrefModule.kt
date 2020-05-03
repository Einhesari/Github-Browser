package alfarobot.gss.com.githubbrowser.di.module

import alfarobot.gss.com.githubbrowser.R
import alfarobot.gss.com.githubbrowser.data.datasource.prefrences.SharedPrefsDataSource
import alfarobot.gss.com.githubbrowser.datasource.SharedPrefDataSourceImpl
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
class SharedPrefModule {

    @Provides
    fun provideSharedPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(
            context.getString(R.string.app_prefs),
            Context.MODE_PRIVATE
        )
    }

    @Provides
    fun provideSharedPrefEditor(sharedPreferences: SharedPreferences): SharedPreferences.Editor {
        return sharedPreferences.edit()
    }

    @Provides
    fun providSharedPrefDataSource(
        sharedPreferences: SharedPreferences,
        editor: SharedPreferences.Editor
    ): SharedPrefsDataSource {
        return SharedPrefDataSourceImpl(sharedPreferences, editor)
    }
}