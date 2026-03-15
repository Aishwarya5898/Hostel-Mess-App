# Hostel Mess Management System (Java)

## Overview

This project is a simple **Hostel Mess Billing System** developed using Java.
It allows mess administrators to register students, track meals, and generate meal bills.

The application is implemented using **Object-Oriented Programming (OOP)** concepts.

## Features

* Register new students
* Log meals (Breakfast, Lunch, Dinner)
* Generate bill based on total meals
* Display all registered students
* Display meal logs for each student

## Technologies Used

* Java
* OOP concepts (Classes, Objects, Encapsulation)
* Collections Framework (HashMap)
* Scanner for user input

## Project Structure

The system consists of the following classes:

### Student

Stores student information:

* Student ID
* Name
* Room number

### MealLog

Tracks meals consumed by each student:

* Breakfast count
* Lunch count
* Dinner count
* Calculates total meals

### BillingSystem

Handles the main system operations:

* Register students
* Log meals
* Generate bills
* Display student records

### HostelMessApp

Contains the main method and menu-driven program to interact with the system.

## How the Billing Works

Each meal costs **₹50**.

Bill calculation:

Total Bill = Total Meals × Rate per Meal

## Example Menu

1. Register Student
2. Log Meal
3. Generate Bill
4. Show Students
5. Show Meal Logs
6. Exit

## Learning Concepts

This project demonstrates:

* Object-Oriented Programming
* Java Collections (HashMap)
* Menu-driven console applications
* Basic data management

## Future Improvements

Possible improvements:

* Store data in a database
* Add monthly billing
* Add student login
* Create a GUI version

## Author

Java practice project created for learning purposes.
