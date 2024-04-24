# Java-Banking-App

Java-Banking-App is a backend service responsible for managing bank accounts, providing functionalities such as creating, retrieving, updating, and deleting accounts, as well as depositing and withdrawing funds.

## Technologies Used
- **Spring Boot:** Used for dependency injection and configuration.
- **MariaDB:** Utilized as the database backend for persistence.

## Features
- **Account Creation:** Allows users to create new bank accounts.
- **Account Retrieval:** Enables users to retrieve account information by ID.
- **Account Update:** Provides functionality to update account details.
- **Account Deletion:** Allows users to delete existing bank accounts.
- **Deposit and Withdrawal:** Facilitates depositing and withdrawing funds from accounts.

## Setup
To run the Java-Banking-App locally, follow these steps:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/java-banking-app.git
   ```
     
2. **Navigate to the project directory:**
   ```bash
   cd Java-Banking-App
   ```
   
3. **Configure MariaDB:**
   Install MariaDB and ensure it's running locally.
   Update the application.properties file with your MariaDB connection     
   details:
   ```bash
   spring.datasource.url=jdbc:mariadb://localhost:3306/banking_app
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
   spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
   ```
   
4. **Build and run the application:**
  ```bash
  ./mvnw spring-boot:run
  ```
5. **Access the application:**
   The application will be running at http://localhost:8080.
