import org.gradle.api.NamedDomainObjectContainer

//app level config constants
object AppConfig {
    const val compileSdk = 34
    const val minSdk = 26
    const val targetSdk = 34
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val customInstrumentedRunner = "com.example.application.InstrumentedTestRunner"
    const val androidTestInstrumentation = "androidx.test.runner.AndroidJUnitRunner"
    const val proguardConsumerRules = "consumer-rules.pro"
    const val release = "release"
    const val proguardRules = "proguard-rules.pro"
    const val proguardOptimize = "proguard-android-optimize.txt"
}