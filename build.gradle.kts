import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    kotlin("kapt") version "1.6.10"
    id("org.jetbrains.compose")
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    // Note, if you develop a library, you should use compose.desktop.common.
    // compose.desktop.currentOs should be used in launcher-sourceSet
    // (in a separate module for demo project and in testMain).
    // With compose.desktop.common you will also lose @Preview functionality
    implementation("com.formdev:flatlaf:2.0")
    implementation("com.miglayout:miglayout-swing:11.0")
    implementation("com.google.dagger:dagger:2.40.5")
    implementation("io.reactivex.rxjava3:rxkotlin:3.0.1")
    implementation("com.fifesoft:rsyntaxtextarea:3.1.6")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation(compose.desktop.currentOs)
    kapt("com.google.dagger:dagger-compiler:2.40.5")
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            appResourcesRootDir.set(project.layout.projectDirectory.dir("xxx"))
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Restsuite"
            packageVersion = "1.0.0"
        }
    }
}
