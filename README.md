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



