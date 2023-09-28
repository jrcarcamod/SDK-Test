package com.siprocal.mobileprofile

import android.content.Context
import android.telephony.TelephonyManager
import android.util.Log
import com.siprocal.core.IMobileProfile

class MobilieProfile: IMobileProfile {
    override fun getMobileProfile(context: Context) {
        Log.d("MobileProfile", "Ejecutando MobileProfile")
        val telephonyManager =
            context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        val networkOperator = telephonyManager.networkOperator
        val mcc: String = if (!networkOperator.isNullOrEmpty()) {
            networkOperator.substring(0, minOf(3, networkOperator.length))
        } else {
            ""
        }
        val sharedPreferences = context.getSharedPreferences("PhoenixSDK", Context.MODE_PRIVATE)

        val editor = sharedPreferences.edit()
        editor.putString("mcc", mcc)
        editor.apply()

//        val valorRecuperado = sharedPreferences.getString("mi_clave", "") // El segundo parámetro es el valor predeterminado si la clave no existe
    }
}