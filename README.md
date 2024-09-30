# Parking Garage Management System

This project is an object-oriented Parking Garage Management System developed as part of the CS251: Introduction to Software Engineering course. It manages parking spaces, handles vehicle entry/exit, calculates fees, and maintains total revenue records. The project follows object-oriented principles like Abstraction, Encapsulation, and Polymorphism.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Project Phases](#project-phases)
- [Contributors](#contributors)

## Introduction
The Parking Garage Management System allows vehicles to park in a garage with a configurable number of slots. It records entry and exit times, calculates parking fees based on duration, and tracks available slots. It supports two parking configurations: First Come First Serve (FCFS) and Best Fit (minimizing space wastage).

## Features
- **Park-in Vehicle**: Assigns a parking slot to a vehicle based on available configurations (FCFS or Best Fit).
- **Park-out Vehicle**: Marks vehicle exit, calculates parking duration, and applies an hourly fee.
- **Display Available Slots**: Shows available parking spaces.
- **Calculate Fees**: Computes parking fees at a rate of 5 EGP per hour.
- **Track Revenue**: Keeps track of total revenue and the number of vehicles that have used the garage.
- **Error Handling**: Manages exceptions with user-friendly error messages for invalid input or system errors.

## Technologies Used
- **Programming Language**: Java
- **Object-Oriented Principles**: Abstraction, Encapsulation, Polymorphism, Inheritance, Interfaces
- **Development Tools**: 
  - Java Development Kit (JDK)
  - Integrated Development Environment (IDE) (e.g., IntelliJ IDEA, Eclipse)
  - Git for version control

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/parking-garage-system.git
   cd parking-garage-system
