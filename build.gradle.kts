plugins {
  java
  id("com.diffplug.spotless") version "6.16.0"
  id("org.springframework.boot") version "3.0.6"
  id("io.spring.dependency-management") version "1.1.0"
}

group = "com.example"

java.sourceCompatibility = JavaVersion.VERSION_17

repositories { mavenCentral() }

dependencyManagement {
  imports {
    mavenBom("org.springframework.experimental:spring-modulith-bom:0.6.0")
    mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
  }
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter")
  annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.springframework.experimental:spring-modulith-starter-test")
}

tasks.withType<Test> { useJUnitPlatform() }

spotless {
  java {
    target("src/**/*.java")
    googleJavaFormat("1.16.0")
  }
  kotlinGradle { ktfmt() }
}
