package com.x01.submission1.ui.LoginActivity

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.x01.submission1.data.Session
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "session")
class LoginPreferences private constructor(private val dataStore: DataStore<Preferences>) {
    private val NAME_KEY = stringPreferencesKey("namw")
    private val EMAIL_KEY = stringPreferencesKey("email")
    private val PASSWORD_KEY = stringPreferencesKey("password")
    private val TOKEN_KEY = stringPreferencesKey("token")
    private val ISLOGIN_KEY = booleanPreferencesKey("isLogin")



    suspend fun saveSession(session: Session){
        dataStore.edit {
            it[NAME_KEY] = session.name
            it[EMAIL_KEY] = session.email
            it[PASSWORD_KEY] = session.password
            it[TOKEN_KEY] = session.token
            it[ISLOGIN_KEY] = session.isLogin
        }
    }

    fun getSession(): Flow<Session>{
        return dataStore.data.map {
            Session(
                it[NAME_KEY]?:"",
                it[EMAIL_KEY]?:"",
                it[PASSWORD_KEY]?:"",
                it[TOKEN_KEY]?:"",
                it[ISLOGIN_KEY]?:false
            )
        }
    }
    suspend fun logout() {
        dataStore.edit { preferences ->
            preferences.clear()
        }
    }
    companion object {
        @Volatile
        private var INSTANCE: LoginPreferences? = null
        fun getInstance(dataStore: DataStore<Preferences>): LoginPreferences {
            return INSTANCE ?: synchronized(this) {
                val instance = LoginPreferences(dataStore)
                INSTANCE = instance
                instance
            }
        }
    }
}