
# CRUD Contacts JDBC

A simple Java terminal-based application for managing contacts using JDBC with a HikariCP connection pool. This project implements basic CRUD (Create, Read, Update, Delete) operations.


## Features

- **CRUD Operations**: Manage contacts (create, read, update, delete) using a MySQL database.
- **Database Integration**: JDBC with HikariCP for efficient database connections.

## Setup and Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/crud-contacts-jdbc.git
   cd crud-contacts-jdbc
   ```

2. Create the database schema:
   Execute the `db-creation.sql` script in your database. The script also inserts two default entries for demonstration purposes.

3. Configure the database connection:
   Update `application.properties` with your database credentials and settings. Ensure it includes the following properties:
   ```
   db.name = 
   db.username = 
   db.password = 
   ```

5. Run the application

## Usage

1. Run the application, and you’ll be prompted with menu options for CRUD operations.
2. Input data as requested to perform the desired operation.

## Technologies Used

- **Java**
- **JDBC** with **HikariCP**
- **Maven**
- **Logback**
