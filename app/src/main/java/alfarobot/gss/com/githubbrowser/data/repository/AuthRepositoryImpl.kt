package alfarobot.gss.com.githubbrowser.data.repository

import alfarobot.gss.com.githubbrowser.R
import alfarobot.gss.com.githubbrowser.data.datasource.prefrences.SharedPrefsDataSource
import alfarobot.gss.com.githubbrowser.domain.repository.AuthRepository
import android.content.Context
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val sharedPrefsDataSource: SharedPrefsDataSource,
    private val context: Context
) :
    AuthRepository {
    override fun getAuthStatus(): Boolean {
        val accessToken =
            sharedPrefsDataSource.getPref(context.getString(R.string.access_token_key))
        return !accessToken.equals("")
    }
}