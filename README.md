# Credit Assessment Calculator API

# Requirements

For building and running the application you need:

* JDK 1.8
* Docker

Note: Maven is already bundled with the project using Maven Wrapper.

# Building using Maven Wrapper

Run the following command to build the project and produce the artifact:

```
./mvnw clean install
```

# Running the Application

There are several ways to run the application:

* Through the `main` method in `com.example.exercise.ExerciseApplication`
* Using Docker by running the following commands:

```
docker build --no-cache -t exercise .

docker run --rm -p 8080:8080 -t exercise
```
* Alternatively, there is a shell script `build_and_run.sh` to automatically build the project and deploy a docker container.

The Swagger UI can be accessed via the url `http://localhost:8080/swagger-ui.html`

# Assumptions

* When a "Company Type" cannot be matched, the score is 0
* "Company Type" match is case insensitive
* If the number of employee is less than 1, the score is 0
* If the time in business is less than 0, the score is 0
