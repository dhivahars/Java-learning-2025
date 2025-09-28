# 🏦 Banking Simulation (Java)

A simple **Banking Simulation System** built using Java.  
This project demonstrates **Encapsulation, OOP concepts, and console-based user interaction**.

---

## 📌 Features
- ✅ Check Account Balance (with authentication)
- ✅ Withdraw Money (validations included)
- ✅ Deposit Money
- ✅ Secure PIN-based access
- ✅ Menu-driven user interface

---

## 📂 Project Structure
com.bankingSimulation/

│

├── BankAccount.java # Represents a bank account (encapsulation of account details)

└── Ui.java # Console-based menu for user interaction

---

## 🧑‍💻 How It Works
1. On running the program, the user sees a menu:
   1.Check Balance
   2.Withdraw
   3.Deposit
   4.Exit
2. The user selects an option.
3. The system asks for **Account Number** and **PIN**.
4. If authentication is successful, the requested operation executes.

---

## 🛠️ Technologies Used
- **Java (Core Java)**
- **OOP Concepts (Encapsulation, Methods, Private Variables)**
- **Scanner (for user input)**

---

## 🚀 How to Run

1. Clone or download the repository.

2. Compile the Java files.

3.Run the program.

Default Account Details:
---------------------------------

Account Number: 1234567890

PIN: 123456

Initial Balance: 10000

Example Run:

Choose a Option

1.Check Balance

2.withdraw

3.deposit

4.Exit

> 1

>Enter Account Number: 1234567890

>Enter Mpin: 123456

Your Balance is: 10000.0
 
-------------------------------------------

Choose a Option

> 2

>Enter Your Account Number: 1234567890

>Enter Mpin: 123456

>Enter amount to Withdraw: 5000

************Transaction Successful************

Do You Like To Display Your Balance

1.Yes

2.No
> 1

5000.0
