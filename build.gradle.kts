import org.gradle.kotlin.dsl.resolver.buildSrcSourceRootsFilePath
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
    var kotlinVer: String by extra
    @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
    var kotlinTestVer: String by extra

    @Suppress("UNUSED_VALUE")
    kotlinVer = "1.2.10"
    @Suppress("UNUSED_VALUE")
    kotlinTestVer = "2.0.7"
}

val kotlinVer: String by extra
val kotlinTestVer: String by extra

plugins {
    kotlin("jvm") version "1.3.0"
    application
}

application {
    mainClassName = "org.example.calculator.CalculatorKt"
}

group = " org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    testCompile("io.kotlintest:kotlintest:$kotlinTestVer")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<JavaExec> {
    main = "org.example.calculator.CalculatorKt"
    classpath = java.sourceSets["main"].runtimeClasspath
}

val compileKotlin by tasks.getting(KotlinCompile::class) {
    // Customise the "compileKotlin" task.
    kotlinOptions.jvmTarget = "1.8"
    doLast { println("Finished compiling Kotlin source code") }
}

val compileTestKotlin by tasks.getting(KotlinCompile::class) {
    // Customise the "compileTestKotlin" task.
    kotlinOptions.jvmTarget = "1.8"
    doLast { println("Finished compiling Kotlin source code for testing") }
}

tasks.create<JavaExec>("executePrintCalc") {
    doLast { println("Hello, Gradle!") }
}


