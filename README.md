# Recurring Deposit (RD) Management System - Backend

## 📌 Project Overview
This project is a Spring Boot based RESTful API designed to manage Recurring Deposit (RD) accounts in a banking environment.

The system allows creation and management of RD users, installment tracking, and passbook history generation.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- RESTful APIs
- Gradle
- MySQL / PostgreSQL

---

## 🗂️ Database Schema

### 🧾 rduser Table
| Field | Description |
|-------|-------------|
| rid | Primary Key |
| acno | Account Number |
| name | Customer Name |
| adharno | Aadhaar Number |
| panno | PAN Number |
| occupation | Occupation |
| dob | Date of Birth |
| gender | Gender |
| addr | Address |
| nname | Nominee Name |
| naddr | Nominee Address |
| nadharno | Nominee Aadhaar |
| npanno | Nominee PAN |

---

### 📘 rdpassbook Table
| Field | Description |
|-------|-------------|
| pid | Primary Key |
| rid | Foreign Key (rduser) |
| famt | Fine Amount |
| rdamt | RD Installment Amount |
| rddate | Installment Date |
| flag | Payment Status |
| lday | Late Days |

---

## 🔹 Key API Features

- ✅ Create RD Account
- ✅ Update RD Account
- ✅ Delete RD Account
- ✅ Add Installment Entry
- ✅ View Passbook by User ID
- ✅ Retrieve All RD Accounts

---

## 🔹 Advanced Business Features

### 🧾 RD Passbook History
Each RD account maintains a **passbook entry system** where every installment is recorded.

Details stored in passbook:
- RD Date
- RD Amount
- Late Days
- Fine Amount

Users can view **complete transaction history**, **total number of transactions**, and **total deposited amount**.

---

### 💰 Loan Eligibility
The system calculates **loan eligibility based on RD transaction history**.

Rules:
- Minimum **6 transactions required** to become eligible.
- Loan amount is calculated based on **total deposited amount**.

---

### ⚠️ Early Settlement
If a user closes the RD account **before completing 12 installments**, the system allows early settlement.

Rule:
- User receives **50% of the deposited amount**.

---

### 📈 RD Maturity Benefit
If the user completes **all 12 installments**, the RD account becomes matured.

Benefits:
- **14% maturity benefit** is applied on total deposited amount.
- A **completion flag is updated** on the dashboard.

---

## 🔹 Advanced Business Features

### 🧾 RD Passbook History
Each RD account maintains a **passbook entry system** where every installment is recorded.

Details stored in passbook:
- RD Date
- RD Amount
- Late Days
- Fine Amount

Users can view **complete transaction history**, **total number of transactions**, and **total deposited amount**.

---

### 💰 Loan Eligibility
The system calculates **loan eligibility based on RD transaction history**.

Rules:
- Minimum **6 transactions required** to become eligible.
- Loan amount is calculated based on **total deposited amount**.

---

### ⚠️ Early Settlement
If a user closes the RD account **before completing 12 installments**, the system allows early settlement.

Rule:
- User receives **50% of the deposited amount**.

---

### 📈 RD Maturity Benefit
If the user completes **all 12 installments**, the RD account becomes matured.

Benefits:
- **14% maturity benefit** is applied on total deposited amount.
- A **completion flag is updated** on the dashboard.

## 🔹 Sample JSON Request

```json
{
  "acno": "AC1001",
  "name": "Rahul Patil",
  "adharno": "111122223333",
  "panno": "PANAA1234A",
  "occupation": "Software Engineer",
  "dob": "1994-05-12",
  "gender": "Male",
  "addr": "Pune, Maharashtra",
  "nname": "Suresh Patil",
  "naddr": "Pune, Maharashtra",
  "nadharno": "999900001111",
  "npanno": "NPAN1001A",
  "rdamt": 1500,
  "rddate": "2026-01-10"
}
🔹 How to Run the Project

Clone the repository

Configure database in application.properties

Run using:

gradlew.bat bootRun

## 🔹 Author
Sachin Jivan Khatavkar

## 🔹 Project Type
Full Stack Banking System Backend (Personal / Academic / Internship Project)



