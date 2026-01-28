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
    - `RollTest`
    - `StatusTest`
- Added new model classes:
    - `Roll` - Extends `Donut` to represent cinnamon rolls and similar items
    - `Status` - Represents order placement status with time windows and approval/decline messages
    - `OrderPlacementStatus` - Enum with values: `OFF`, `SCHEDULED`, `OPEN`, `CLOSED`
- Added `DONUT` and `ROLLS` values to `ItemType` enum.
- Added `spring-boot-starter-test` dependency for testing support.
- Added JSON test data files for all models in `src/test/resources`:
    - `donuts.json`
    - `customers.json`
    - `orders.json`
    - `icings.json`
    - `frostings.json`
- Added `@EqualsAndHashCode(of = {"id"})` to all model classes for proper equality comparison based on ID.
- Added `@Serial` annotation and explicit `serialVersionUID` to all `Serializable` classes.
- Added `testEqualsAndHashCode()` methods to test classes: `FrostingTest`, `IcingTest`, `ItemTest`, `OrderTest`, `RollTest`.

### Changed
- Removed `@Document` annotation from `Customer` and `Donut` models to decouple from MongoDB.
- Replaced `spring-boot-starter-data-mongodb` with `spring-data-commons` in `pom.xml` to support `@Id` annotation without full MongoDB dependency.
- Changed `Donut` class fields to `protected` visibility to support inheritance by `Roll` class.
