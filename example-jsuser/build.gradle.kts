plugins {
    kotlin("js") version "1.4.21"
}

group = "me.shun"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    maven(url = "https://shwaka.github.io/maven/")
    jcenter()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-js"))
    implementation("com.github.shwaka.example.mplib:example-mplib-js:0.1")
}

kotlin {
    js(LEGACY) {
        browser {
            binaries.executable()
            webpackTask {
                cssSupport.enabled = true
            }
            runTask {
                cssSupport.enabled = true
            }
            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
    }
}
