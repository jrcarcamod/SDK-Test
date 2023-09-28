package com.siprocal.sdk

import android.content.Context
import android.util.Log
import androidx.annotation.Keep
import com.siprocal.core.IAppInsight
import com.siprocal.core.IMobileProfile
import com.siprocal.core.ITelephonyProfile

class PhoenixSDK private constructor(
    private val context: Context,
    private val appInsight: IAppInsight? = null,
    private val telephonyProfile: ITelephonyProfile? = null,
    private val mobileProfile: IMobileProfile? = null
) {
    companion object {
        @JvmStatic
        @JvmName("initSdk")
        fun init(
            context: Context,
            appInsight: IAppInsight? = null,
            telephonyProfile: ITelephonyProfile? = null,
            mobileProfile: IMobileProfile? = null
        ) {
            val sdk = PhoenixSDK(context, appInsight, telephonyProfile, mobileProfile)
            sdk.internalInit()
        }
    }

    private fun internalInit() {
        appInsight?.getAppInsight(context)
        telephonyProfile?.getTelephonyProfile()
        mobileProfile?.getMobileProfile(context)
        Log.d("SDK", "Inicio los procesos del SDK principal")
    }
}
