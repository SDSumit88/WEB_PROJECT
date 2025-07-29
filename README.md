# Spring Boot JWT Authentication Microservice 🔐

A simple Spring Boot microservice for **user registration**, **login**, **JWT-based authentication** (access + refresh tokens), and **profile access**.

Also includes a **basic HTML + JavaScript UI** for demo/testing purposes.

---

## 💠 Tech Stack

* Java 17
* Spring Boot 3+
* Spring Security 6
* JWT (JJWT 0.11.5)
* MySQL
* HTML, JavaScript (Frontend UI)

---

## 📌 Features

### ✅ User Registration

* `POST /api/auth/register`
* Request body: `{ "username": "user", "password": "pass" }`

### ✅ User Login

* `POST /api/auth/login`
* Returns `accessToken` (short-lived) and `refreshToken` (longer-lived)

### 🔁 Refresh Token

* `POST /api/auth/refresh`
* Pass `refreshToken` in `Authorization` header to get a new access token:

  ```
  Authorization: Bearer <refreshToken>
  ```

### 👤 Get User Profile

* `GET /api/user/profile`
* Requires `accessToken` in header:

  ```
  Authorization: Bearer <accessToken>
  ```

---

## 📂 MySQL Setup

Create a DB named `userdb`:

```sql
CREATE DATABASE userdb;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

---

## 🚀 Run the App

```bash
mvn spring-boot:run
```

App will run at:
📍 `http://localhost:8082`

---

## 🔪 Frontend UI

Basic HTML/JS files for login/register/profile are located in:

```
src/main/resources/static/
```

Access in browser:

* `http://localhost:8080/index.html` (Login)
* `http://localhost:8080/register.html` (Register)
* `http://localhost:8080/profile.html` (View profile)

---

## 📂 Folder Structure

```
src/
🔾 config/               # Security config, JWT utils, filters
🔾 controller/           # Auth & User controllers
🔾 dto/                  # Login request DTO
🔾 entity/               # User entity
🔾 repository/           # UserRepository
🔾 service/              # UserService, UserDetailsServiceImpl
🔾 resources/static/     # HTML/JS frontend
```

---

## 🔒 Token Usage in Postman

1. Register a User
Send a POST request to /api/auth/register with the following JSON body:

json
Copy
Edit
{
  "username": "your_username",
  "password": "your_password"
}


2. Login
Send a POST request to /api/auth/login with the same credentials.
You will receive a response containing accessToken and refreshToken:

json
Copy
Edit
{
  "accessToken": "xxxxx",
  "refreshToken": "yyyyy"
}



3. Use Access Token
To call protected APIs (like /api/user/profile), add the following header:

makefile
Copy
Edit
Authorization: Bearer <accessToken>




4. Refresh Access Token
If your access token expires, send a POST request to /api/auth/refresh-token with the refresh token in the body:

json
Copy
Edit
{
  "refreshToken": "yyyyy"
}
This will return a new access token which you can use for further authenticated requests.

---

## 👨‍💻 Author

Created with by Sumit Singh Thakur
Certified Full Stack Java Developer

---
