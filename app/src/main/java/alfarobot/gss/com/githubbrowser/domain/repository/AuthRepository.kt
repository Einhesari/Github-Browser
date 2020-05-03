package alfarobot.gss.com.githubbrowser.domain.repository

interface AuthRepository {
    fun getAuthStatus() : Boolean
}