# Pokemon Project

![Pokemon Logo](app/src/main/res/drawable/somethingnew.png)

This project utilizes the Ktor library for networking and Jetpack Compose HorizontalPager to display images in a carousel format.

## Table of Contents
- [Introduction](#introduction)
- [Clean Architecture](#clean-architecture)
- [Ktor](#ktor)
- [Jetpack Compose HorizontalPager](#jetpack-compose-horizontalpager)
- [Database](#database)

## Introduction

Briefly introduce your project here, including its purpose and key features.

## Clean Architecture
-**Separation of Concerns (SoC)**:
  - The project divides functionality into separate layers: presentation, domain, and data.
  - Each layer has distinct responsibilities: UI rendering, business logic, and data access, respectively.
  - This separation enhances code organization and readability.

- **Dependency Inversion Principle (DIP)**:
  - The project relies on abstractions rather than concrete implementations.
  - Components depend on interfaces (e.g., `Repository`) rather than specific implementations.
  - This promotes loose coupling and facilitates easier swapping of implementations.

- **Testability**:
  - The project's architecture supports testability at various levels.
  - Components can be easily isolated for unit testing due to their modular design.
  - Mocking and stubbing of dependencies is straightforward, enhancing testability.


## Ktor

[Ktor](https://ktor.io/) is a framework for building asynchronous servers and clients in connected systems using Kotlin. Explain how you've used Ktor in your project, such as for making network requests to fetch Pokemon data.

## Jetpack Compose HorizontalPager

Jetpack Compose is a modern toolkit for building native Android UI. The [HorizontalPager](https://developer.android.com/jetpack/compose/gestures#horizontal-pager) component allows you to horizontally scroll through a list of items. Describe how you've implemented HorizontalPager to display Pokemon images in a carousel format.

## Database

Explain the database component of your project, including what type of database you're using (e.g., Room, SQLite) and how it's integrated into your app architecture.

## Getting Started

Include instructions on how to get started with your project, such as how to clone the repository, set up dependencies, and run the app.

## Contributors

List the contributors to your project.

## License

Specify the license under which your project is distributed.

## Acknowledgments

Give credit to any resources, libraries, or individuals that have inspired or helped your project.

