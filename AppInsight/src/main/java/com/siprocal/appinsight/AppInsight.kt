package com.siprocal.appinsight

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import com.siprocal.core.IAppInsight

class AppInsight: IAppInsight{
    override fun getAppInsight(context: Context) {
        val packageManager: PackageManager = context.getPackageManager()
        val allInstalledPackages = packageManager.getInstalledPackages(PackageManager.GET_META_DATA)
        val strings = ArrayList<String>()
        for (each in allInstalledPackages) strings.add(each.packageName)
        var p: PackageInfo
        p = packageManager.getPackageInfo(strings[0], 0)

        val sharedPreferences = context.getSharedPreferences("PhoenixSDK", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("app_installed", p.packageName)
        editor.apply()
    }

}