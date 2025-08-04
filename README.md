# JSON User Filter & Sort - Java Application

This Java-based utility parses a JSON array of user data, filters the users based on age, sorts them by their last login timestamp, and outputs the final result in JSON format.

---

##  Features

-  Parse JSON input of users  
-  Filter users with age>=18  
- Sort users by `lastLogin` (latest first)  
-  Output result in clean JSON format  

---

##  Input JSON Format

Example:

```json
[
  {"firstName": "John", "lastName": "Doe", "age": 25, "lastLogin": "2025-07-08T12:34:56Z"},
  {"firstName": "Jane", "lastName": "Smith", "age": 17, "lastLogin": "2025-06-01T09:00:00Z"},
  {"firstName": "Alice", "lastName": "Johnson", "age": 21, "lastLogin": "2025-07-07T14:00:00Z"}
]


---

## Output JSON Format

After filtering (`age >=18`) and sorting (`latest login first`):

```json
[
  { "name": "Alice Johnson", "lastLogin": "2025-07-07T14:00:00Z" },
  { "name": "John Doe", "lastLogin": "2025-07-08T12:34:56Z" }
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
    "age": 21,
    "lastLogin": "2025-07-20T18:15:00"
  },
  {
    "login": "rahul",
    "age": 17,
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
