# Project Statement

## Project Title
SmartSpend – Java Personal Expense Management System

## Problem Statement
Managing personal income, expenses, and monthly budgets using scattered notes or spreadsheets can be inconvenient and error-prone. SmartSpend provides a simple command-line Java application to record financial transactions and generate useful summaries.

## Objectives
1. Provide secure and simple user registration and login.
2. Record and manage income and expenses.
3. Allow users to set monthly budgets.
4. Generate financial summaries and category-wise expense reports.
5. Persist data locally using files.

## Target Users
Students and individuals who want a lightweight personal finance tracker that can run from a terminal.

## Functional Requirements
- Register and authenticate users.
- Add, view and delete income records.
- Add, view and delete expense records.
- Set and view a monthly budget.
- Generate total income, total expense and balance reports.
- Save and reload application data.

## Non-Functional Requirements
- Usability: clear menu-driven CLI.
- Reliability: validate input and handle file errors.
- Performance: efficient collection-based operations for normal personal datasets.
- Maintainability: separate model, service and utility packages.
- Portability: runnable on systems with Java 17+.
- Security: passwords are not displayed while entering them and user data is separated by user ID.

## Scope
The project focuses on personal finance tracking through a command-line interface. It does not connect to banks or process real payments.

## Future Enhancements
A database-backed version, graphical/web interface, CSV/PDF export, charts and stronger password hashing can be added later.
