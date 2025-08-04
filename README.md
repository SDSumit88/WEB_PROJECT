# JSON User Filter & Sort - Java Application

This Java-based utility parses a JSON array of user data, filters the users based on age, sorts them by their last login timestamp, and outputs the final result in JSON format.

---

##  Features

-  Parse JSON input of users  
-  Filter users with age **greater than 25**  
- Sort users by `lastLogin` (latest first)  
-  Output result in clean JSON format  

---

##  Input JSON Format

Example:

```json
[
  {
    "login": "johndoe",
    "age": 30,
    "lastLogin": "2024-12-01T10:30:00"
  },
  {
    "login": "janedoe",
    "age": 22,
    "lastLogin": "2025-01-15T09:20:00"
  }
]
```

---

## Output JSON Format

After filtering (`age > 25`) and sorting (`latest login first`):

```json
[
  {
    "login": "johndoe",
    "age": 30,
    "lastLogin": "2024-12-01T10:30:00"
  }
]
```

---

## Technologies Used

- Java 17+  
- Gson for JSON parsing  
- `Comparator` for sorting  
- `LocalDateTime` & `DateTimeFormatter` for date parsing  
- Scanner for console input  

---

##  How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/SDSumit88/WEB_PROJECT.git
   cd WEB_PROJECT
   git checkout sumit_json_parser
   ```

2. Compile & Run:
   ```bash
   javac Main.java
   java Main
   ```

3. Paste the input JSON when prompted.

---

##  Sample Test Case

**Input JSON (via console):**

```json
[
  {
    "login": "sumit",
    "age": 28,
    "lastLogin": "2025-07-20T18:15:00"
  },
  {
    "login": "rahul",
    "age": 24,
    "lastLogin": "2025-07-28T10:00:00"
  }
]
```

**Output JSON:**

```json
[
  {
    "login": "sumit",
    "age": 28,
    "lastLogin": "2025-07-20T18:15:00"
  }
]
```

---


For queries or walkthrough, feel free to reach out at:  
📧 singhthakursumit807@gmail.com
