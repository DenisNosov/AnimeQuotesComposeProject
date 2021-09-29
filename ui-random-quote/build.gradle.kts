plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = 31

    defaultConfig {
        minSdk = 21
        targetSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(Modules.domain))
    implementation(project(Modules.model))
    implementation(project(Modules.commonUiCompose))

    implementation(Dependencies.androidxCore)

    implementation(Dependencies.navigationCompose)

    implementation(Dependencies.composeFoundation)
    implementation(Dependencies.composeMaterial)
    implementation(Dependencies.composeUiTooling)
    implementation(Dependencies.composeUiToolingPreview)

    implementation(Dependencies.kotlinStdlib)

    implementation(Dependencies.hiltAndroid)
    implementation(Dependencies.hiltNavigationCompose)
    kapt(Dependencies.hiltCompiler)

}