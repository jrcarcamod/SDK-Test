package com.siprocal.sdk

import android.content.Context
import android.util.Log
import androidx.annotation.Keep
import com.siprocal.core.IAppInsight
import com.siprocal.core.IMobileProfile
import com.siprocal.core.ITelephonyProfile

@Keep
object PhoenixSDK {
    fun init(
        context: Context,
        appInsight: IAppInsight? = null,
        telephonyProfile: ITelephonyProfile? = null,
        mobileProfile: IMobileProfile? = null
    ) {
        appInsight?.getAppInsight(context)
        telephonyProfile?.getTelephonyProfile()
        mobileProfile?.getMobileProfile(context)
        Log.d("SDK", "Inicio los procesos del SDK principal")
    }
}