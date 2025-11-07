# Spring User Management
## Task – User Management with DTO and Conversion
### Goal
Build a complete REST API in Spring Boot that handles users (`User`).
The application should demonstrate understanding of:
* The Spring Boot ecosystem
* REST conventions
* Data transfer via `@RequestBody`, `@PathVariable` and `@RequestParam`
* Conversion between entity and DTO
* JSON handling with Jackson
* Configuration with `application.properties`
* Using Spring Boot DevTools
## Part 1 – Project setup
1. Create a new Spring Boot project via Spring Initializr.
Include:
* Spring Web
* Spring Boot DevTools
2. Verify that the project can be started.
3. Create a configuration file (`application.properties`) and define at least:
* Application name
* Port number
* A custom configuration key (e.g. version)
## Part 2 – Model classes
1. Create an entity class `User` that represents a user.
It should contain fields such as id, first name, last name, email, age, and
creation date.
2. Create a DTO class `UserDTO` that is used to send data to and from
the API.
It only contains relevant data for the client, such as full name, email
and age.
## Part 3 – Mapper
1. Create a class that converts between `User` and `UserDTO`.
2. The conversion should be done in both directions:
* `User` → `UserDTO`
* `UserDTO` → `User`
3. When a new `User` object is created, a creation date should be automatically set.
## Part 4 – Service
1. Create a service class that handles all logic for user data.
2. Use an in-memory list (e.g. `List` or `Map`) to store users instead of
a database.
3. Implement functions to:
* Get all users
* Get a user by ID
* Create a new user
* Search for users by age
4. All communication between the service and the controller should be done with DTO objects.
## Part 5 – Controller
1. Create a REST controller with the following endpoints:
* GET `/api/users` → Get all users
* GET `/api/users/{id}` → Get users by ID
* GET `/api/users/search?age=` → Filter users by age
* POST `/api/users` → Create a new user
2. All POST calls should receive JSON via @RequestBody.
3. Responses from all endpoints should be returned as JSON according to the DTO structure.
4. Use `ResponseEntity` to return status codes (e.g. 201 Created for POST).
## Part 6 – Testing
1. Test the API with Postman or curl.
2. Verify that:
* New users can be created
* All users are returned as JSON
* You can retrieve users by ID
* Filtering by `age` works correctly
3. Verify that the fields in the DTO are returned as expected and not the entire entity.
## Part 7 – Deep dive (optional)
If you have time, add the following functionality:
1. Update a user via PUT `/api/users/{id}`.
2. Delete a user via DELETE `/api/users/{id}`.
3. Add simple error handling.
4. Create an endpoint that reads a configuration key from `application.properties` (e.g. version).