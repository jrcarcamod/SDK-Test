package com.siprocal.sdk

import android.util.Log

object PhoenixSDK {
    fun init(phoenixSDKSettings: PhoenixSDKSettings){
        phoenixSDKSettings.appInsight?.getAppInsight(phoenixSDKSettings.context)
        phoenixSDKSettings.telephonyProfile?.getTelephonyProfile()
        phoenixSDKSettings.mobileProfile?.getMobileProfile(phoenixSDKSettings.context)
        Log.d("SDK", "Inicio los procesos del SDK principal")
    }

    fun setSensitiveData(sensitive:Boolean){
        Log.d("PhoenixSDK","sensitive: "+sensitive)
    }

    fun updateOptin(optin:Boolean){
        Log.d("PhoenixSDK","Optin: "+optin)
    }

    fun setClientAttributes(clientAttributes:String){
        Log.d("PhoenixSDK","clientAttributes: "+clientAttributes)
    }

}