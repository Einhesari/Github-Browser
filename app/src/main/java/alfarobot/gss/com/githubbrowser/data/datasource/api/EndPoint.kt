package alfarobot.gss.com.githubbrowser.data.datasource.api

private const val clientId = "685e6244dd56a72db4c6"
private const val clientSecret = "50c7fa47bd384aaf6487c4ae2a375a8f6891cda0"
private const val redirectUrl = "mohsen://mygithubredirecturl.com/mohsen"
private const val scope = "user"

object AuthEndPoint {
    const val baseUrl = "https://github.com/login/oauth/"
    const val authorize = "authorize/"
    const val accessToken = "access_token/"

    const val AuthFullUrl = baseUrl + authorize + "?" +
            "client_id=$clientId&" +
            "redirect_uri=$redirectUrl&" +
            "scope=$scope"
}