package com.appsneakers.app.data.repository

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.appsneakers.app.data.local.AuthPref
import com.appsneakers.app.data.model.ActionState
import com.appsneakers.app.data.model.AuthUser

class AuthRepository(val context: Context) {
    private val authPref: AuthPref by lazy { AuthPref(context) }

    val authUser = MutableLiveData<AuthUser>(authPref.authUser)
    val isLogin = MutableLiveData<Boolean>(authPref.isLogin)

    suspend fun login(email:String, passwoard: String): ActionState<AuthUser> {
        return authPref.login(email, passwoard)
    }

    suspend fun register (user: AuthUser) : ActionState<AuthUser> {
        return  authPref.register(user)
    }

    suspend fun logout() : ActionState<Boolean> {
        return  authPref.logout()
    }
}