pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Siprocal-SDK"
include(":app")
include(":sdk")
include(":core")
include(":AppInsight")
include(":TelephonyProfile")
include(":MobileProfile")
