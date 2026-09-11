# SmartSpend – Java Personal Expense Management System

**Course:** Programming in Java  
**Project Type:** Command-Line Application  
**Author:** Dhananjay Choudhary

SmartSpend is a Java-based personal finance manager that lets a user register/login, record income and expenses, manage a monthly budget, and generate financial reports. The project is designed to demonstrate practical Java programming and object-oriented programming concepts.

## Features

- User registration and login
- Add and view income
- Add, view and delete expenses
- Monthly budget management
- Total income, expense and balance calculation
- Category-wise expense analysis
- Local text-file persistence
- Input validation and exception handling
- Command-line execution without GUI or external database requirements

## Java Concepts Demonstrated

- Classes and objects
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- `ArrayList` and Java Collections
- Exception handling
- File handling and NIO
- Java Date and Time API
- Packages and modular design
- Streams and lambda expressions

## Requirements

- Java JDK 17 or later
- Terminal / Command Prompt / PowerShell

Check the installation:

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
│   │   ├── User.java
│   │   ├── Transaction.java
│   │   ├── Income.java
│   │   ├── Expense.java
│   │   └── Budget.java
│   ├── service/
│   │   ├── UserManager.java
│   │   ├── IncomeManager.java
│   │   ├── ExpenseManager.java
│   │   ├── BudgetManager.java
│   │   └── ReportManager.java
│   └── util/
│       ├── FileManager.java
│       └── ValidationUtil.java
├── tests/
│   └── SmartSpendTest.java
├── data/
└── docs/
    ├── project-report.md
    ├── diagrams.md
    ├── database-design.md
    ├── test-cases.md
    └── demo-script.md
```

## Compile and Run – Linux/macOS

From the repository root:

```bash
mkdir -p out
a=$(find src -name "*.java")
javac -d out $a tests/SmartSpendTest.java
java -cp out com.smartspend.Main
```

Run the tests:

```bash
java -ea -cp out SmartSpendTest
```

## Compile and Run – Windows PowerShell

```powershell
New-Item -ItemType Directory -Force out | Out-Null
Get-ChildItem -Recurse src -Filter *.java | ForEach-Object { $_.FullName } | Set-Content sources.txt
javac -d out @sources.txt tests/SmartSpendTest.java
java -cp out com.smartspend.Main
```

Run the tests:

```powershell
java -ea -cp out SmartSpendTest
```

## Application Flow

```text
Register/Login
      ↓
   Dashboard
      ↓
 ┌────┼─────────┬──────────┐
Income Expense Budget   Report
      ↓      ↓       ↓       ↓
      └──────┴───────┴───────┘
              ↓
        Text File Storage
```

## Documentation

- [Project Report](docs/project-report.md)
- [UML & Architecture Diagrams](docs/diagrams.md)
- [Data Design](docs/database-design.md)
- [Test Cases](docs/test-cases.md)
- [Demo & Viva Script](docs/demo-script.md)

## Demo Visuals

The `screenshots/` folder contains **illustrative terminal mockups** representing expected application screens. They are documentation visuals, not claims of captured execution output.

- `screenshots/login.svg`
- `screenshots/dashboard.svg`
- `screenshots/expense.svg`
- `screenshots/report.svg`

## Data Storage

The application stores records locally in the `data/` directory. Required directories/files are created as the application writes data.

## Testing

The project includes a lightweight Java test program using assertions. Detailed functional test cases are documented in `docs/test-cases.md`.

## Future Scope

- JDBC/MySQL or PostgreSQL persistence
- GUI or web interface
- CSV/PDF report export
- Charts and dashboards
- Recurring transactions
- Cloud synchronization

## Academic Note

This repository is intended as a course project demonstrating Java programming concepts through a practical application.
