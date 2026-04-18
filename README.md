# bankAccounts

Spring Boot account management project exposing both REST and GraphQL APIs. The repository is built as a small backend lab for practicing data access, DTO mapping, and multiple API styles in the same service.

## Highlights

- REST endpoints under `/api/Comptes`
- GraphQL queries for listing accounts and fetching by id
- GraphQL mutation for creating new accounts
- JPA persistence layer with DTO and mapper classes
- H2 in-memory database for local development

## Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Spring GraphQL
- Spring Web
- H2 Database
- Lombok
- Springdoc OpenAPI

## GraphQL Operations

- `listerComptes`
- `compteById`
- `addCompte`

## Run Locally

```bash
./mvnw spring-boot:run
```

The application is configured to run on port `8085`.

## Notes

The project currently uses H2 in `application.properties`, while `compose.yaml` provisions MongoDB. If you want a single setup path, the database configuration should be aligned in a future cleanup.
