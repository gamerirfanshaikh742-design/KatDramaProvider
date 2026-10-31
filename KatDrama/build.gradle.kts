plugins {
    id("com.android.library")
    id("kotlin-android")
}

apply(plugin = "com.lagradost.cloudstream3.gradle")

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

cloudstream {
    setRepo(System.getenv("GITHUB_REPOSITORY") ?: "gamerirfanshaikh742-design/KatDramaProvider")
    authors = listOf("YourName")

    status = 1
    tvTypes = listOf("TvSeries", "Movie", "AsianDrama")
    iconUrl = "https://www.google.com/s2/favicons?domain=katdrama.org&sz=%size%"
}

dependencies {
    implementation("com.lagradost:cloudstream3:pre-release")
    implementation("org.jsoup:jsoup:1.15.3")
}
