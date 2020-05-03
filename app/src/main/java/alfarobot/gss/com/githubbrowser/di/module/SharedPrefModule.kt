package alfarobot.gss.com.githubbrowser.di.module

import alfarobot.gss.com.githubbrowser.R
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import net.bytebuddy.matcher.ModifierMatcher

@Module
class SharedPrefModule(private val context: Context) {

    @Provides
    fun provideSharedPrefs(): SharedPreferences {
        return context.getSharedPreferences(
            context.getString(R.string.app_prefs),
            Context.MODE_PRIVATE
        )
    }

    @Provides
    fun provideSharedPrefEditor(sharedPreferences: SharedPreferences): SharedPreferences.Editor {
        return sharedPreferences.edit()
    }
}