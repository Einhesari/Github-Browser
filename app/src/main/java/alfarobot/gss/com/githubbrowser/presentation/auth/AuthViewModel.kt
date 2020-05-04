package alfarobot.gss.com.githubbrowser.presentation.auth

import alfarobot.gss.com.githubbrowser.domain.usecase.AuthUseCase
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class AuthViewModel @Inject constructor(private val authUseCase: AuthUseCase) : ViewModel() {

    fun getUserAuthStatus(): Boolean {
        return authUseCase.userAuthStatus()
    }

    fun getAccessCode(code: String?) {
        code?.let {

        }
    }
}