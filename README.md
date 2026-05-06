# 📄 Spring Data JPA Pagination Application

A Spring Boot application demonstrating **pagination** using **Spring Data JPA** and the `Pageable` interface.

---

## 📌 Project Overview

This project showcases how to efficiently retrieve large datasets in smaller chunks using **pagination**.  

Pagination is a key feature in real-world applications to improve performance and manage large volumes of data.

---

## 🧠 Concepts Covered

- Spring Boot
- Spring Data JPA
- Pagination using `Pageable`
- Page request handling
- Efficient data retrieval

---

## 🏗️ Project Structure
src/main/java/in/siddharth/
├── Application.java
├── entity/
│ └── Employee.java
└── repo/
└── EmployeeRepository.java


---

## ⚙️ Tech Stack

- Java  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- Maven  

---

## 📄 Pagination Example

### Repository Method

```java
Page<Entity> findAll(Pageable pageable);

▶️ How to Run
Clone the repository
Open in IDE (Eclipse / IntelliJ)
Configure database in application.properties
Run Application.java

👨‍💻 Author
Siddharth Gaikwad
