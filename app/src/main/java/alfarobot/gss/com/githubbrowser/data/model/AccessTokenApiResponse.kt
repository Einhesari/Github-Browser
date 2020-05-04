package alfarobot.gss.com.githubbrowser.data.model

import com.google.gson.annotations.SerializedName

data class AccessTokenApiResponse(
    @SerializedName("access_token")
    val accessToken: String,
    @SerializedName("scope")
    val scope: String,
    @SerializedName("token_type")
    val tokenType: String
)