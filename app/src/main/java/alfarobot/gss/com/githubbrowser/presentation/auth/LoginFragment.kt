package alfarobot.gss.com.githubbrowser.presentation.auth

import alfarobot.gss.com.githubbrowser.App
import alfarobot.gss.com.githubbrowser.R
import alfarobot.gss.com.githubbrowser.ViewModelProviderFactory
import alfarobot.gss.com.githubbrowser.databinding.FragmentLoginBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import javax.inject.Inject

class LoginFragment : Fragment() {

    @Inject
    lateinit var factory: ViewModelProviderFactory

    private lateinit var viewModel: AuthViewModel
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        App.component
            .viewModelComponentFactory
            .create()
            .inject(this)

        viewModel = ViewModelProvider(this, factory)[AuthViewModel::class.java]

        if (viewModel.getUserAuthStatus()) {
            //TODO Go To Main Activity
        } else {
            binding.btnLogin.setOnClickListener {
                findNavController().navigate(
                    R.id.action_loginFragment_to_githubWebviewFragment,
                    null
                )
            }
        }

    }

}
