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
└── tests/
```

## Compile and Run

From the repository root:

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

## Data Storage

The application uses simple text files in the `data/` directory for local persistence. The application creates required files when needed.

## Testing

Test cases cover registration/login, valid and invalid transaction input, budget calculation, report generation, and file persistence.

## Author

Dhananjay Choudhary

Programming in Java – Course Project
