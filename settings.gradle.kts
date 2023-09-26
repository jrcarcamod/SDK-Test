pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }

    }
}

rootProject.name = "Siprocal-SDK"
include(":app")
include(":sdk")
include(":core")
include(":AppInsight")
include(":TelephonyProfile")
include(":MobileProfile")
