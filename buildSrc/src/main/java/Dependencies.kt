object Dependencies {

    const val composeVersion = Versions.compose

    //Plugins
    const val androidGradlePlugin = Plugins.androidGradlePlugin
    const val kotlinPlugin = Plugins.kotlinPlugin
    const val kotlinAndroidExtensions = Plugins.kotlinAndroidExtensions

    const val hiltPlugin = Plugins.hiltPlugin
    const val navigationSafeArgsPlugin = Plugins.navigationSafeArgsPlugin


    //Libraries
    const val androidxCore = Libraries.androidxCore

    const val composeUi = Libraries.composeUi
    const val composeMaterial = Libraries.composeMaterial
    const val composeUiTooling = Libraries.composeUiTooling
    const val composeUiToolingPreview = Libraries.composeUiToolingPreview
    const val composeActivity = Libraries.composeActivity
    const val composeFoundation = Libraries.composeFoundation
    const val composeMaterialIconsCore = Libraries.composeMaterialIconsCore
    const val composeMaterialIconsExtended = Libraries.composeMaterialIconsExtended

    const val lifecycleViewModel = Libraries.lifecycleViewModel
    const val lifecycleRuntime = Libraries.lifecycleRuntime
    const val lifecycleViewModelSavedState = Libraries.lifecycleViewModelSavedState
    const val lifecycleViewModelCompose = Libraries.lifecycleViewModelCompose
    const val lifecycleCommonJava8 = Libraries.lifecycleCommonJava8

    const val navigationCompose = Libraries.navigationCompose

    const val kotlinStdlib = Libraries.kotlinStdlib
    const val kotlinCoroutines = Libraries.kotlinCoroutines

    const val hiltAndroid = Libraries.hiltAndroid
    const val hiltNavigationCompose = Libraries.hiltNavigationCompose
    const val hiltCompiler = Libraries.hiltCompiler

    const val retrofit = Libraries.retrofit
    const val retrofitConverterGson = Libraries.retrofitConverterGson
    const val okHttp = Libraries.okHttp
    const val okHttpLoggingInterceptor = Libraries.okHttpLoggingInterceptor
    const val gson = Libraries.gson

    object Libraries {
        const val androidxCore = "androidx.core:core-ktx:${Versions.androidxCore}"

        const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
        const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val composeUiToolingPreview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val composeActivity =
            "androidx.activity:activity-compose:${Versions.androidxActivityCompose}"
        const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.compose}"
        const val composeMaterialIconsCore =
            "androidx.compose.material:material:${Versions.compose}"
        const val composeMaterialIconsExtended =
            "androidx.compose.material:material-icons-extended:${Versions.compose}"

        const val lifecycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val lifecycleRuntime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val lifecycleViewModelSavedState =
            "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"
        const val lifecycleViewModelCompose =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
        const val lifecycleCommonJava8 =
            "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"

        const val navigationCompose =
            "androidx.navigation:navigation-compose:${Versions.navigation}"

        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
        const val kotlinCoroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesCore}"

        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltNavigationCompose =
            "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"

        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitConverterGson =
            "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val okHttpLoggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }

    private object Versions {
        const val androidGradlePluginVersion = "7.1.0-alpha12"
        const val kotlinVersion = "1.5.30"

        const val navigation = "2.4.0-alpha09"
        const val hilt = "2.38.1"
        const val coroutinesCore = "1.5.2"
        const val lifecycle = "2.4.0-beta01"
        const val androidxCore = "1.6.0"
        const val androidxActivityCompose = "1.3.1"
        const val compose = "1.0.2"
        const val hiltNavigationCompose = "1.0.0-alpha03"
        const val retrofit = "2.9.0"
        const val okHttp = "4.8.0"
        const val gson = "2.8.6"
    }

    private object Plugins {

        const val androidGradlePlugin =
            "com.android.tools.build:gradle:${Versions.androidGradlePluginVersion}"
        const val kotlinPlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
        const val kotlinAndroidExtensions =
            "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlinVersion}"

        const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
        const val navigationSafeArgsPlugin =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"

    }
}