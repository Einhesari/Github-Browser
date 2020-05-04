package alfarobot.gss.com.githubbrowser.data.datasource.api

import alfarobot.gss.com.githubbrowser.data.model.AccessTokenApiResponse
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthApi {

    @POST(AuthEndPoint.ACCESS_TOKEN)
    suspend fun getAccessToken(
        @Query("client_id") clientID: String,
        @Query("client_secret") clientSecret: String,
        @Query("code") code: String,
        @Query("redirect_uri") redirectUri: String
    ): AccessTokenApiResponse
}