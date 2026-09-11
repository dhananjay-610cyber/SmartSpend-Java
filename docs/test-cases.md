# SmartSpend Test Cases

| ID | Test Case | Input / Action | Expected Result |
|---|---|---|---|
| TC01 | Register user | Valid username and password | Account created successfully |
| TC02 | Duplicate registration | Existing username | Registration rejected |
| TC03 | Login | Correct credentials | Dashboard displayed |
| TC04 | Invalid login | Wrong credentials | Error message displayed |
| TC05 | Add income | Valid amount and category | Income saved |
| TC06 | Add expense | Valid amount and category | Expense saved |
| TC07 | Invalid amount | Zero, negative or non-numeric amount | Input rejected |
| TC08 | Delete expense | Existing expense ID | Expense removed |
| TC09 | Set budget | Valid monthly budget | Budget saved |
| TC10 | View report | Existing transactions | Income, expenses, balance and category totals displayed |
| TC11 | File persistence | Restart application | Previously saved records remain available |
| TC12 | Empty report | No transactions | Clear zero-value summary displayed |

## Testing Approach

- Functional testing for every major module
- Boundary testing for invalid amounts and empty input
- Authentication testing for valid and invalid credentials
- Persistence testing after application restart
- Manual CLI testing using representative user scenarios
