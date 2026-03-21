# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Spring Boot application that mocks an IATA NDC (New Distribution Capability) sandbox server for Online Travel Agency (OTA) operations. The application provides REST web services for air shopping and offer pricing operations.

## Technology Stack

- **Language**: Kotlin 2.1.0 (with Java 21)
- **Framework**: Spring Boot 3.4.0
- **Build Tool**: Maven (use wrapper: `./mvnw`)
- **Database**: H2 and HSQLDB (in-memory for development)
- **API Documentation**: Swagger UI at http://localhost:8090/swagger-ui/index.html

## Build and Run Commands

### Standard Development
```bash
# Clean and build the project
./mvnw clean build

# Run the application
./mvnw spring-boot:run

# Run tests
./mvnw test

# Run a single test
./mvnw test -Dtest=MyOtaServerApplicationTests
```

### With Custom Maven Settings
If you have organization-specific Maven repositories, use:
```bash
./mvnw -s settings.xml spring-boot:run
```

### CI/CD
The GitHub Actions workflow uses:
```bash
mvn -B package --file pom.xml
```

## Architecture

### Code Generation via JAXB

A critical aspect of this project is **JAXB-based code generation from XSD schemas**. The `jaxb-maven-plugin` generates Java classes from IATA NDC schema files during the Maven build:

- **Schema files**: `src/main/xsd/*.xsd`
- **Bindings**: `src/main/xjb/global-bindings.xjb` (configures date/time adapters)
- **Generated code location**: `src/main/java/com/github/surajcm/online/travel/schema/`

**Generated packages**:
- `schema.request.shop` - from IATA_AirShoppingRQ.xsd
- `schema.response.shop` - from IATA_AirShoppingRS.xsd
- `schema.request.offer` - from IATA_OfferPriceRQ.xsd
- `schema.response.offer` - from IATA_OfferPriceRS.xsd
- `schema.error` - from error.xsd

**Important**: These Java classes are generated files. Do not manually edit them. If schema changes are needed, modify the XSD files and regenerate.

### Mixed Kotlin/Java Compilation

The project uses both Kotlin and Java:
- **Kotlin sources**: `src/main/kotlin` and `src/test/kotlin`
- **Java sources**: `src/main/java` (mostly generated JAXB classes)

Compilation order: Kotlin compiles first, then Java. This allows Java code to reference Kotlin classes.

### Custom XML Adapters

Located in `com.github.surajcm.online.travel.dataaccess.serialization`:
- `LocalDateAdapter` - handles xs:date to java.time.LocalDate
- `ZonedDateTimeAdapter` - handles xs:dateTime to java.time.ZonedDateTime

These are referenced in `global-bindings.xjb` and used by all JAXB-generated classes.

### Package Structure

```
com.github.surajcm.online.travel
├── MyOtaServerApplication.kt (main entry point)
├── air.controller (REST controllers)
├── dataaccess.serialization (XML adapters)
└── schema (generated from XSD)
    ├── request.shop
    ├── request.offer
    ├── response.shop
    ├── response.offer
    └── error
```

## Important Notes

- **Java Version**: Project uses Java 21, but Kotlin plugin jvmTarget is set to 17 (line 140 in pom.xml)
- **Port**: Application runs on port 8090 (default Spring Boot port is 8080, but this may be configured)
- **Maven Settings**: The project includes a `settings.xml` for repository configuration, useful for environments with custom Maven repos
- **No Manual Schema Edits**: Never manually edit generated Java files in `src/main/java/com/github/surajcm/online/travel/schema/`
