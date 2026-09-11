# SmartSpend Demo Script

Use this flow for a classroom demonstration or viva.

## Step 1 – Start
Run the application from the command line.

## Step 2 – Register
Choose **Register**, enter a new username and password, and confirm account creation.

## Step 3 – Login
Use the newly created credentials to open the dashboard.

## Step 4 – Add Income
Enter an income amount and category such as Scholarship or Salary.

## Step 5 – Add Expenses
Add a few expenses such as Food, Travel and Education.

## Step 6 – Set Budget
Set a monthly spending limit.

## Step 7 – Generate Report
Show total income, total expenses, remaining balance and category-wise spending.

## Step 8 – Persistence
Exit and restart the application. Previously saved records should still be available.

## Viva Points
- Why Java? Object-oriented design, standard libraries and portability.
- Why text files? Simple local persistence without external database dependencies.
- Where is encapsulation? Model fields are private and accessed through methods.
- Where is inheritance? `Income` and `Expense` extend the common `Transaction` abstraction.
- How is invalid input handled? Validation utilities and exception handling.
