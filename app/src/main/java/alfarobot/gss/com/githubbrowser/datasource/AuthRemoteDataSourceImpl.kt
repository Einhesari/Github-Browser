package alfarobot.gss.com.githubbrowser.datasource

import alfarobot.gss.com.githubbrowser.data.datasource.api.AuthApi
import alfarobot.gss.com.githubbrowser.data.datasource.remote.AuthRemoteDataSource
import javax.inject.Inject

class AuthRemoteDataSourceImpl @Inject constructor(private val authApi: AuthApi) : AuthRemoteDataSource {
    override suspend fun getAccessCode(code: String): String {
        TODO("Not yet implemented")
    }
}