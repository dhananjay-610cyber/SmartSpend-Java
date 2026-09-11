# SmartSpend – Java Personal Expense Manager

A command-line personal finance management system developed in Java for the Programming in Java course.

## Features
- User registration and login
- Add, view and delete income records
- Add, view and delete expense records
- Monthly budget management
- Financial summary and category-wise reports
- File-based persistent storage
- Input validation and exception handling

## Java Concepts Demonstrated
- Classes and objects
- Encapsulation
- Inheritance and polymorphism
- Abstraction
- Collections (`ArrayList`)
- Exception handling
- File handling
- Java Date and Time API
- Packages and modular programming

## Requirements
- Java JDK 17 or later
- Command-line terminal

Check Java:

```bash
java -version
javac -version
```

## Project Structure

```text
SmartSpend-Java/
├── README.md
├── statement.md
├── .gitignore
├── src/com/smartspend/
│   ├── Main.java
│   ├── model/
│   ├── service/
│   └── util/
├── data/
├── tests/
└── docs/
    ├── diagrams.md
    ├── project-report.md
    ├── test-cases.md
    └── demo-script.md
```

## Compile and Run

From the repository root:

### Linux / macOS / Git Bash

```bash
javac -d out $(find src -name "*.java")
java -cp out com.smartspend.Main
```

### Windows PowerShell

```powershell
Get-ChildItem -Recurse src -Filter *.java | ForEach-Object { $_.FullName } | Set-Content sources.txt
javac -d out @sources.txt
java -cp out com.smartspend.Main
```

## Test

Compile the application and test sources, then run the test class:

```bash
javac -d out $(find src tests -name "*.java")
java -cp out SmartSpendTest
```

## Documentation

- [Project Statement](statement.md)
- [Project Report](docs/project-report.md)
- [UML & Architecture Diagrams](docs/diagrams.md)
- [Test Cases](docs/test-cases.md)
- [Demo / Viva Script](docs/demo-script.md)

## Data Storage

The application uses simple text files in the `data/` directory for local persistence. The application creates required files when needed.

## Author

Dhananjay Choudhary

Programming in Java – Course Project
