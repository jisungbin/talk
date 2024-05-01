/*
 * Developed by Ji Sungbin 2024.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/jisungbin/Talk/blob/main/LICENSE
 */
plugins {
  id("com.android.application")
  kotlin("android")
}

android {
  namespace = "app.talk"
  compileSdk = 34

  defaultConfig {
    minSdk = 23
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  sourceSets {
    getByName("main").java.srcDir("src/main/kotlin")
  }
}
