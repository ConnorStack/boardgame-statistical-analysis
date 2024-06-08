val ktor_version = "2.3.0"
val kotlin_version = "1.8.0"
val logback_version = "1.2.11"
val graphql_kotlin_version = "6.2.4"

plugins {
    kotlin("jvm") version "2.0.0"
    id("io.ktor.plugin") version "2.3.11"
}

group = "personalprojects.me"
version = "0.0.1"

application {
    mainClass.set("personalprojects.me.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-serialization-gson:$ktor_version")
    implementation("com.expediagroup:graphql-kotlin-server:$graphql_kotlin_version")
    implementation("com.expediagroup:graphql-kotlin-schema-generator:$graphql_kotlin_version")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
