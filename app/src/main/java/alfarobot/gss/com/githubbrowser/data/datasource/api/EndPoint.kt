package alfarobot.gss.com.githubbrowser.data.datasource.api


object AuthEndPoint {
    private const val CLIENT_ID = "685e6244dd56a72db4c6"
    private const val CLIENT_SECRET = "50c7fa47bd384aaf6487c4ae2a375a8f6891cda0"
    private const val SCOPE = "user"

    const val BASEURL = "https://github.com/login/oauth/"
    const val AUHTORIZE = "authorize/"
    const val ACCESS_TOKEN = "access_token/"
    const val REDIRECT_URL = "mohsen://mygithubredirecturl.com/mohsen"

    const val AuthFullUrl = BASEURL + AUHTORIZE + "?" +
            "client_id=$CLIENT_ID&" +
            "redirect_uri=$REDIRECT_URL&" +
            "scope=$SCOPE"
}