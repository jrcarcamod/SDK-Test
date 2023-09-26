package com.siprocal.mobileprofile

import android.util.Log
import com.siprocal.core.IMobileProfile

class MobilieProfile: IMobileProfile {
    override fun getMobileProfile() {
        Log.d("MobileProfile", "Inicio la recolecion de Mobile Profile")
    }
}