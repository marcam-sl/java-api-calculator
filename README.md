# Simple Calculator

This is a simple calculator application built with Java and Spring Boot. The application supports four basic operations: addition, subtraction, multiplication, and division via HTTP requests.

## Project Structure
simple-calculator/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ ├── Calculator.java
│ │ │ ├── CalculatorController.java
│ │ │ └── SimpleCalculatorApplication.java
│ └── test/
│ ├── java/
│ │ └── com/
│ │ └── example/
│ │ ├── CalculatorTest.java
│
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── build.gradle
└── README.md


## Build and Run with Maven

1. **Build the project:**

    ```bash
    mvn clean package
    ```

2. **Run the application:**

    ```bash
    java -jar target/simple-calculator-1.0-SNAPSHOT.jar
    ```

## Build and Run with Gradle

1. **Build the project:**

    ```bash
    gradle build
    ```

2. **Run the application:**

    ```bash
    java -jar build/libs/simple-calculator-1.0-SNAPSHOT.jar
    ```

## Run with Docker

1. **Build the Docker image:**

    ```bash
    docker-compose build
    ```

2. **Run the Docker container:**

    ```bash
    docker-compose up
    ```

The application will be available at `http://localhost:8080`.

## API Endpoints

- **Addition:** `GET /calculator/add?a={num1}&b={num2}`
- **Subtraction:** `GET /calculator/subtract?a={num1}&b={num2}`
- **Multiplication:** `GET /calculator/multiply?a={num1}&b={num2}`
- **Division:** `GET /calculator/divide?a={num1}&b={num2}`

## Testing

To run the tests:

- **With Maven:**

    ```bash
    mvn test
    ```

- **With Gradle:**

    ```bash
    gradle test
    ```
