# SmartSpend – Project Report

## 1. Title
**SmartSpend – Java-Based Personal Expense Management System**

## 2. Introduction
SmartSpend is a command-line personal finance application developed using Java. It helps users record income and expenses, manage a monthly budget, and generate financial summaries.

## 3. Problem Statement
Manual expense tracking can be difficult and inconsistent. Users need a simple system that stores transactions, validates input, calculates totals and presents useful financial information.

## 4. Objectives
- Record income and expenses.
- Organize expenses by category.
- Maintain a monthly budget.
- Generate financial summaries.
- Demonstrate core Java programming concepts.

## 5. Scope
The application is designed for individual users and local command-line use. Data is persisted in text files. Online banking integration, cloud synchronization and GUI features are outside the current scope.

## 6. Functional Requirements
1. User registration and login.
2. Add, view and delete income records.
3. Add, view and delete expense records.
4. Set and view monthly budget.
5. Generate total income, expense and balance reports.
6. Store data persistently.

## 7. Non-Functional Requirements
- **Usability:** Simple menu-driven CLI.
- **Reliability:** Validate input and handle exceptions.
- **Maintainability:** Separate model, service and utility packages.
- **Performance:** Efficient collection-based in-memory processing for normal personal transaction volumes.
- **Portability:** Uses standard Java libraries and runs on systems with JDK 17+.

## 8. Technology Stack
- Language: Java
- JDK: 17+
- Storage: Text files
- Interface: Command Line
- Version Control: Git/GitHub

## 9. System Architecture
The application follows a lightweight layered design:

**CLI Layer → Service Layer → Model Layer → Utility/File Storage**

The service layer contains business operations, model classes represent application data, and utility classes provide validation and file handling.

See [diagrams.md](diagrams.md) for UML and architecture diagrams.

## 10. Modules
### User Management
Handles registration and authentication.

### Expense Management
Creates, displays and removes expense records.

### Income Management
Stores and displays income records.

### Budget Management
Maintains a monthly spending limit.

### Reports and Analytics
Calculates income, expenses, balance and category-wise spending.

## 11. Java Concepts Used
- Encapsulation through private fields and methods.
- Inheritance using the transaction hierarchy.
- Polymorphism through transaction subclasses.
- Abstraction for common transaction behavior.
- Collections for record management.
- Exception handling for invalid input and file operations.
- File handling for persistence.
- Date/Time API for transaction dates.
- Packages for modular organization.

## 12. Workflow
1. Start application.
2. Register or log in.
3. Select a dashboard operation.
4. Enter and validate transaction information.
5. Save information to local files.
6. Generate reports when required.
7. Logout or exit.

## 13. Testing
The system includes functional, validation, authentication and persistence test cases. Detailed cases are available in [test-cases.md](test-cases.md).

## 14. Expected Outcome
SmartSpend provides a simple local finance-management solution while demonstrating practical use of Java OOP, collections, exception handling, file handling and modular design.

## 15. Conclusion and Future Scope
The project meets its core objective of providing a command-line expense and income manager. Future versions could add a graphical interface, database storage, export to CSV/PDF, charts, recurring transactions and cloud synchronization.
