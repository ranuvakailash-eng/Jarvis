plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.jarvis.mobile"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jarvis.mobile"
        minSdk = 26
        targetSdk = 35
        versionCode = 2
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
}
