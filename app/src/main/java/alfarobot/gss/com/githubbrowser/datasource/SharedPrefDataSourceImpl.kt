package alfarobot.gss.com.githubbrowser.datasource

import alfarobot.gss.com.githubbrowser.data.datasource.prefrences.SharedPrefsDataSource
import android.content.SharedPreferences
import javax.inject.Inject

class SharedPrefDataSourceImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val editor: SharedPreferences.Editor
) : SharedPrefsDataSource {
    override fun savePref(value: String, key: String) {
        editor.putString(value, key)
        editor.apply()
    }

    override fun getPref(key: String): String? {
        return sharedPreferences.getString(key, "")
    }
}
