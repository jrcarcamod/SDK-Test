package com.siprocal.sdk

import android.content.Context
import android.util.Log
import com.siprocal.core.IAppInsight
import com.siprocal.core.IMobileProfile
import com.siprocal.core.ITelephonyProfile

class PhoenixSDKSettings private constructor(
     val context: Context,
     val appInsight: IAppInsight? = null,
     val telephonyProfile: ITelephonyProfile? = null,
     val mobileProfile: IMobileProfile? = null
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

        fun build(): PhoenixSDKSettings {
            val phoenixSDKSettings = PhoenixSDKSettings(context, appInsight, telephonyProfile, mobileProfile)
         //   phoenixSDKSettings.internalInit() // Ejecuta los métodos de inicialización
            return phoenixSDKSettings
        }
    }


}
