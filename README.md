# Employee Management System

A simple console-based Employee Management System developed using Java and Object-Oriented Programming concepts.

## Features

- Add new employees
- View all employees
- Search employees by ID
- Update employee salary
- Delete employee records
- Menu-driven console interface

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Maven

## Project Structure

```text
employee-management-system/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── employee/
│   │               ├── App.java
│   │               └── Employee.java
│   └── test/
├── pom.xml
├── .gitignore
└── README.md
```

## How to Run

1. Install Java JDK and Maven.
2. Clone this repository.
3. Open the project folder in your terminal.
4. Compile the project:

```bash
mvn compile
```

5. Run the application:

```bash
mvn exec:java "-Dexec.mainClass=com.employee.App"
```

## Data Storage

Employee records are stored temporarily using Java ArrayList. The data is not permanently saved and will be lost when the application closes.

## Future Improvements

- Integrate MySQL database using JDBC.
- Develop REST APIs using Spring Boot.
- Build a frontend using React.
