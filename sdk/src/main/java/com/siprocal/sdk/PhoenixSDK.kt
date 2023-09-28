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
        inline fun build(context: Context, block: Builder.() -> Unit) = Builder(context).apply(block).build()
    }


    class Builder(private val context: Context) {
        private var appInsight: IAppInsight? = null
        private var telephonyProfile: ITelephonyProfile? = null
        private var mobileProfile: IMobileProfile? = null

        fun setAppInsight(appInsight: IAppInsight?): Builder {
            this.appInsight = appInsight
            return this
        }

        fun setTelephonyProfile(telephonyProfile: ITelephonyProfile?): Builder {
            this.telephonyProfile = telephonyProfile
            return this
        }

        fun setMobileProfile(mobileProfile: IMobileProfile?): Builder {
            this.mobileProfile = mobileProfile
            return this
        }

        fun build(): PhoenixSDK {
            val phoenixSDK = PhoenixSDK(context, appInsight, telephonyProfile, mobileProfile)
            phoenixSDK.internalInit() // Ejecuta los métodos de inicialización
            return phoenixSDK
        }
    }

    private fun internalInit() {
        appInsight?.getAppInsight(context)
        telephonyProfile?.getTelephonyProfile()
        mobileProfile?.getMobileProfile(context)
        Log.d("SDK", "Inicio los procesos del SDK principal")
    }
}
