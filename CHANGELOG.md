# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

## [1.0.0-SNAPSHOT] - 2024-05-22

### Added
- Added unit tests for all domain models:
    - `DonutTest`
    - `ItemTest`
    - `IcingTest`
    - `FrostingTest`
    - `OrderTest`
    - `CustomerTest`
- Added `DONUT` value to `ItemType` enum.
- Added `spring-boot-starter-test` dependency for testing support.
- Added JSON test data files for all models in `src/test/resources`:
    - `donuts.json`
    - `customers.json`
    - `orders.json`
    - `icings.json`
    - `frostings.json`

### Changed
- Removed `@Document` annotation from `Customer` and `Donut` models to decouple from MongoDB.
- Replaced `spring-boot-starter-data-mongodb` with `spring-data-commons` in `pom.xml` to support `@Id` annotation without full MongoDB dependency.
