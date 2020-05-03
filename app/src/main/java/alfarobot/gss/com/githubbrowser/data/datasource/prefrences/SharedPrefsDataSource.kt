package alfarobot.gss.com.githubbrowser.data.datasource.prefrences

interface SharedPrefsDataSource {
    fun savePref(value: String, key: String)
    fun getPref(key: String) :String?
}