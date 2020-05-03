package alfarobot.gss.com.githubbrowser.domain.usecase

import alfarobot.gss.com.githubbrowser.domain.repository.AuthRepository
import javax.inject.Inject

class AuthUseCase @Inject constructor(private val authRepository: AuthRepository) {

    fun userAuthStatus(): Boolean {
        return authRepository.getAuthStatus()
    }

}