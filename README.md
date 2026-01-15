# 📌 RecallTrack – DSA Spaced Repetition Backend

RecallTrack is a Spring Boot backend application designed to help students systematically revise Data Structures & Algorithms (DSA) problems using the concept of spaced repetition.

The project demonstrates real-world backend development concepts including REST APIs, layered architecture, database persistence, and clean code structure using Java and Spring Boot.

---

## 🚀 Features

- Add DSA problems with difficulty and confidence level  
- Automatically track revision metadata  
- Fetch all stored problems via REST APIs  
- Persistent storage using PostgreSQL  
- Clean layered backend architecture  

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Maven
- Postman (API Testing)

---

## 🏗 Architecture Overview

Client → Controller → Service → Repository → Database

### Layer Responsibilities

- Controller: Handles HTTP requests and responses  
- Service: Contains application business logic  
- Repository: Handles database operations using JPA  
- Database: Stores application data  

---

## 🔌 API Endpoints

### ➤ Add a Problem

POST `/problems`

Request Body:

```json
{
  "title": "Two Sum",
  "difficulty": "Easy",
  "confidenceLevel": 3
}

