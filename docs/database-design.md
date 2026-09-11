# SmartSpend Data Design

SmartSpend intentionally uses local text-file persistence so the project can run from the command line without installing an external database.

## Files

| File | Purpose |
|---|---|
| `data/users.txt` | User credentials/profile records |
| `data/income.txt` | Income transactions |
| `data/expenses.txt` | Expense transactions |
| `data/budgets.txt` | Monthly budget records |

## Transaction Record

A transaction is stored as:

```text
username | amount | category | description | date
```

The application replaces the `|` character in descriptions before storage so the delimiter remains safe.

## Logical Relationship

```text
User (1) -------- (Many) Income
  |
  +-------------- (Many) Expense
  |
  +-------------- (Many) Budget

Income and Expense share common Transaction attributes.
```

## Design Choice

Text files were selected because this is an educational command-line project. They keep deployment simple and demonstrate Java file handling. A production version could migrate the persistence layer to MySQL/PostgreSQL using JDBC or JPA without changing the overall service/model separation.
