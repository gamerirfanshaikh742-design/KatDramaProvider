buildscript {
    repositories {
        google()
        mavenCentral()
        maven { uri = uri("https://jitpack.io") }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
        classpath("com.github.recloudstream:gradle:mastF-SNAPSHOT")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { uri = uri("https://jitpack.io") }
    }
}
