# System Architecture

SmartSpend follows a simple layered architecture.

```text
User
  |
  v
Main (CLI)
  |
  +--> Service Layer
  |     +--> UserManager
  |     +--> IncomeManager
  |     +--> ExpenseManager
  |     +--> BudgetManager
  |     +--> ReportManager
  |
  +--> Model Layer
  |     +--> User
  |     +--> Transaction
  |     +--> Income / Expense
  |     +--> Budget
  |
  v
Utility Layer
  +--> FileManager
  +--> ValidationUtil
  |
  v
Local Text Files
```

The design separates user-interface flow, business logic, data models and persistence utilities, making the application easier to maintain and test.
