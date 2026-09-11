# SmartSpend Diagrams

## 1. Use Case Diagram

```mermaid
flowchart LR
    U((User)) --> R[Register / Login]
    U --> E[Manage Expenses]
    U --> I[Manage Income]
    U --> B[Manage Monthly Budget]
    U --> P[View Financial Reports]
    E --> V[Validate Input]
    I --> V
    B --> V
    E --> F[(Text File Storage)]
    I --> F
    B --> F
    R --> F
    P --> F
```

## 2. Class Diagram

```mermaid
classDiagram
    class User {
        -String username
        -String password
        +getUsername()
        +getPassword()
    }
    class Transaction {
        <<abstract>>
        -double amount
        -String category
        -LocalDate date
        +getAmount()
        +getCategory()
        +getDate()
    }
    class Income
    class Expense
    class Budget {
        -YearMonth month
        -double limit
        +getLimit()
    }
    class UserManager
    class ExpenseManager
    class IncomeManager
    class BudgetManager
    class ReportManager
    class FileManager
    class ValidationUtil

    Transaction <|-- Income
    Transaction <|-- Expense
    UserManager --> User
    ExpenseManager --> Expense
    IncomeManager --> Income
    BudgetManager --> Budget
    ReportManager --> ExpenseManager
    ReportManager --> IncomeManager
    ExpenseManager --> FileManager
    IncomeManager --> FileManager
    BudgetManager --> FileManager
    UserManager --> FileManager
    ExpenseManager --> ValidationUtil
    IncomeManager --> ValidationUtil
```

## 3. Sequence Diagram – Add Expense

```mermaid
sequenceDiagram
    actor User
    participant Main
    participant ExpenseManager
    participant ValidationUtil
    participant FileManager

    User->>Main: Select Add Expense
    Main->>ExpenseManager: addExpense()
    ExpenseManager->>ValidationUtil: validate amount/category
    ValidationUtil-->>ExpenseManager: Valid input
    ExpenseManager->>FileManager: save expense
    FileManager-->>ExpenseManager: Saved
    ExpenseManager-->>Main: Success message
    Main-->>User: Expense added
```

## 4. Application Architecture

```text
+---------------------------+
|       CLI / Main          |
+-------------+-------------+
              |
              v
+---------------------------+
|       Service Layer       |
| User | Expense | Income   |
| Budget | Report Managers  |
+-------------+-------------+
              |
              v
+---------------------------+
|       Model Layer         |
| User | Expense | Income   |
| Transaction | Budget      |
+-------------+-------------+
              |
              v
+---------------------------+
|       Utility Layer       |
| FileManager | Validation  |
+-------------+-------------+
              |
              v
+---------------------------+
|      Text File Storage    |
+---------------------------+
```
