package com.siprocal.telephonyprofile

import android.util.Log
import com.siprocal.core.ITelephonyProfile

class TelephonyProfile: ITelephonyProfile {
    override fun getTelephonyProfile() {
        Log.d("TelephonyProfile", "Inicio la recoleccion de Telephony Profile")
    }
}