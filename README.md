# Fawzy System - Software Project

This repository contains the implementation of the Fawzy System, a web-based service API allowing users to interact with various services such as mobile, landline, internet, and donations. The system supports functionality like user authentication, service search, payment processing, wallet management, and transaction history tracking.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [System Design](#system-design)
- [Installation](#installation)
- [API Endpoints](#api-endpoints)
- [Contributors](#contributors)

## Project Overview
The Fawzy System allows users to register, log in, and access a variety of services with the ability to make payments, manage discounts, and view transaction histories. Admins have additional functionality to manage discounts, refunds, and user transactions.

## Features
- **User Registration & Login**: Users can sign up and log in to the system using their email, username, and password.
- **Service Search**: Users can search for services by name.
- **Payments & Discounts**: Users can make payments for services and view available discounts.
- **Wallet Management**: Users can add funds to their wallet via credit card.
- **Transaction Management**: Admins can view all user transactions, refunds, and wallet operations.

## Technologies Used
- **Backend**: Java (Spring Boot framework)
- **Database**: Singleton Pattern for centralized database interaction
- **Design Patterns**: 
  - Singleton (Database Management)
  - Factory (Service Creation)
  - Decorator (Payment Discounts)
- **API Documentation**: Postman

## System Design

### Class Diagram
The project implements several design patterns such as Singleton for the database, Factory for service object creation, and Decorator for applying discounts. For a more detailed explanation, refer to the class diagram in the project documentation.

### Sequence Diagram
The sequence diagrams illustrate the flow of user interactions like signup, login, service search, and payment.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/tarkeem/software-project.git
   cd software-project

API Endpoints
User Registration:

POST /signUp
Example Request:
{
  "email": "mohamed@gmail.com",
  "password": "123456",
  "username": "mohamed"
}
User Login:

POST /ClientLogin
Example Request:
{
  "email": "mohamed@gmail.com",
  "password": "123456"
}
Service Search:

GET /Search
Example Request:

{
  "Service_name": "mobile"
}
Add Wallet Funds:

POST /AddWallet
Example Request:
{
  "email": "mohamed@gmail.com",
  "password": "123456",
  "balance": 20.0,
  "serialNumber": "123456789"
}
Admin Transactions:

GET /history - List all payment transactions
GET /AddWallets - List all wallet transactions
GET /refunds - List all refund transactions