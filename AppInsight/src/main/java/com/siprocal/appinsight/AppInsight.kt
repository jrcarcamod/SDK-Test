package com.siprocal.appinsight

import android.util.Log
import com.siprocal.core.IAppInsight

class AppInsight: IAppInsight{
    override fun getAppInsight() {
        Log.d("AppInsight", "Se inicio la Recoleccion del AppHisyory")
    }
}