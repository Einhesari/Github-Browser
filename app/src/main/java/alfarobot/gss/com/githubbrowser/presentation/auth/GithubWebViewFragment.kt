package alfarobot.gss.com.githubbrowser.presentation.auth

import alfarobot.gss.com.githubbrowser.R
import alfarobot.gss.com.githubbrowser.data.datasource.api.AuthEndPoint.AuthFullUrl
import alfarobot.gss.com.githubbrowser.data.datasource.api.AuthEndPoint.REDIRECT_URL
import alfarobot.gss.com.githubbrowser.databinding.FragmentGithubWebviewBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_github_webview.*

class GithubWebViewFragment : Fragment() {

    private lateinit var binding: FragmentGithubWebviewBinding
    val url = AuthFullUrl

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_github_webview, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    val webviewClient = object : WebViewClient() {
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            request?.let {
                val url = it.url.toString()
                if (url.startsWith(REDIRECT_URL)) {
                    //TODO get cridentials
                    return true
                } else {
                    view?.loadUrl(url)
                    return false
                }
            } ?: run {
                webviewLoading.show()
                return super.shouldOverrideUrlLoading(view, request)
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            webviewLoading.hide()
        }

        override fun onReceivedError(
            view: WebView?,
            request: WebResourceRequest?,
            error: WebResourceError?
        ) {
            super.onReceivedError(view, request, error)
            webviewLoading.hide()
            //TODO GO BACK
        }
    }
}
