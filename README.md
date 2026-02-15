# Recurring Deposit Management System - Backend

## 📌 Project Description
This is a Spring Boot based REST API project for managing Recurring Deposit (RD) accounts. 
The system allows creating, updating, deleting RD users and managing their installment details.

---

## 🔹 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST API
- MySQL / PostgreSQL

---

## 🔹 Database Structure

### 🧾 rduser Table

- rid (Primary Key)
- acno
- name
- adharno
- panno
- occupation
- dob
- gender
- addr
- nname
- naddr
- nadharno
- npanno

---

### 📘 rdpassbook Table

- pid (Primary Key)
- rid (Foreign Key)
- famt
- rdamt
- rddate
- flag
- lday

---

## 🔹 Sample JSON Request

```json
{
  "acno": "AC1001",
  "addr": "Pune, Maharashtra",
  "adharno": "111122223333",
  "agree": true,
  "dob": "1994-05-12",
  "gender": "Male",
  "naddr": "Pune, Maharashtra",
  "nadharno": "999900001111",
  "name": "Rahul Patil",
  "nname": "Suresh Patil",
  "npanno": "NPAN1001A",
  "occupation": "Software Engineer",
  "panno": "PANAA1234A",
  "rdamt": 1500,
  "rddate": "2026-01-10",
  "rid": 1
}

🔹 API Features

✅ Create RD User

✅ Update RD User

✅ Delete RD User

✅ Add RD Installment

✅ Fetch Passbook by User ID

✅ Retrieve All RD Accounts

🔹 API Features

✅ Create RD User

✅ Update RD User

✅ Delete RD User

✅ Add RD Installment

✅ Fetch Passbook by User ID

✅ Retrieve All RD Accounts

## 🔹 Author
Sachin Jivan Khatavkar

## 🔹 Project Type
Academic / Internship / Personal Banking System Project



