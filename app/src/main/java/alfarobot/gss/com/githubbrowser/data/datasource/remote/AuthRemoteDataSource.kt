package alfarobot.gss.com.githubbrowser.data.datasource.remote

interface AuthRemoteDataSource {
    suspend fun getAccessCode(code: String): String
}