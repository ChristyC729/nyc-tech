# Introduction

This repo will be taking a look at a couple full-stack problems and working through the problems. The table of contents will give a closer look at the different problems and will be explored later on in the README.

### Table of Content

1. Manipulating SQL Database
2. Object-Oriented General Programming
3. Web Form Submission and Handling


## Q1: Manipulating SQL Database
**Given a SQL database with the following table full of data**

``` SQL
CREATE TABLE countries(
    code CHAR(2) NOT NULL,
    year INT NOT NULL,
    gdp_per_capita DECIMAL(10,2) NOT NULL,
    govt_debt DECIMAL(10,2) NOT NULL
);
```
Sample Data:
| code  | year  |  gdp_per_capita   | govt_debt |
| ----- |:-----:| :----------------:|:---------:|
| QA    | 2019  |  553.00           | 524.00    |
| MA    | 2019  |  519.00           | 580.00    |
| LU    | 2019  |  577.00           | 514.00    |
| SI    | 2019  |  520.00           | 510.00    |
| BR    | 2019  |  516.00           | 543.00    |

Please write the SQL statement to show the top 3 average government debts in percent of the gdp_per_capita (govt_debt/gdp_per_capita) for those countries of which gdp_per_capita was over 40,000 dollars in every year in the last four years.


## Q2: OOP General Programming
**Write a program to simulate the following scenario:**
* All cars have 1 engine and 1 driver
* A car engine can perform operations such as:
    * Ignite
    * Accelerate
    * Burn Fuel
    * Turn Belts
    * Shift Gears
* Some engine behaviors can be invoked directly by the driver, while others cannot
* Some engine behaviors trigger other engine behaviors
* All cars maintain a record of their own speed and direction

Use OOP Designs to make needed classes with methods to meet those requirements. You can use any language or pseudo-code to write down your results. 

## Q3: Web Form Submission and Handling
In a form, we have three input boxes for users to type in their choices of courses and submit the form without refreshing the page (i.e. using ajax request). Here are the requirements:
1. User can type in 1, 2, or 3 courses
2. Each choice in case insensitive (also, user can type anything, in any case or leave it empty)
3. The choices have to contain "calculus" (in any case, e.g. "Calculus" or "CALCULUS") in one input box
4. Frontend code should make sure the choices contain "calculus"
5. Backend code on the server side needs to have the same validation as in frontend to make sure data is consistent

```JS
<form action="/post" /* form submission handler...*/>
    Choice A: <input type="text" name="choices[]"/>
    Choice B: <input type="text" name="choices[]"/>
    Choice C: <input type="text" name="choices[]"/>
    <input type="submit" value="Submit"/>
</form>
```
1. Please use vanilla Javascript or any frontend framework to submit the request
2. Please use any backend framework to handle the request and save the correct data into a database
