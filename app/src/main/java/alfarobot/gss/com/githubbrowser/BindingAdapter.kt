package alfarobot.gss.com.githubbrowser

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.BindingAdapter

class BindingAdapter {
    companion object {
        @JvmStatic
        @BindingAdapter("android:loadWebUrl")
        fun loadUrl(webView: WebView, url: String) {
            webView.settings.javaScriptEnabled = true
            webView.loadUrl(url)
        }

        @JvmStatic
        @BindingAdapter("android:webViewClient")
        fun setWebviewClient(view: WebView, client: WebViewClient?) {
            view.webViewClient = client
        }
    }
}