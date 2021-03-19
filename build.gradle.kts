plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.31"
    id("org.jetbrains.kotlin.plugin.spring") version "1.4.31"
}

repositories {
    mavenCentral()
}

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:2.4.4"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage")
    }
    testRuntimeOnly("de.flapdoodle.embed:de.flapdoodle.embed.mongo:2.2.0")
}

tasks {
    test {
        useJUnitPlatform()
        systemProperty("spring.test.constructor.autowire.mode", "all")
    }
}
