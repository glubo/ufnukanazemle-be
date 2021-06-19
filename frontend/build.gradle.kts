plugins {
    id("dev.fritz2.fritz2-gradle") version "0.11"
}

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js(IR) {
        browser()
    }.binaries.executable()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("dev.fritz2:core:0.11")
                // see https://components.fritz2.dev/
                // implementation("dev.fritz2:components:0.11")
            }
            java {
                sourceCompatibility = JavaVersion.VERSION_11
            }
        }
        val jvmMain by getting {
            dependencies {
            }
            java {
                sourceCompatibility = JavaVersion.VERSION_11
            }
        }
        val jsMain by getting {
            dependencies {
            }
        }
    }
}