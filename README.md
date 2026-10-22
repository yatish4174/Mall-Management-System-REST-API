Mall Management System REST API
📌 Project Overview
The Mall Management System REST API is a Java-based backend application developed using Spring Boot. It provides RESTful APIs to manage mall information, including mall names, locations, contact numbers, total floors, total shops, opening times, and closing times.

The application follows a layered architecture to separate business logic, database operations, and HTTP request handling. It uses Spring Data JPA to interact with an Oracle database.

🚀 Features
Add mall details to the database.
Retrieve mall information.
Retrieve mall details by ID.
Update mall information.
Delete mall records by ID.
Support bulk insertion of mall records.
Store and manage data using an Oracle database.
Perform database operations using Spring Data JPA.
🛠️ Technologies Used
Programming Language: Java
Framework: Spring Boot
API Architecture: REST API
Database: Oracle Database
ORM Framework: Hibernate
Persistence: Spring Data JPA
Build Tool: Maven
API Testing: Postman
Version Control: Git and GitHub
🏗️ Project Architecture
The application follows a layered architecture:

Client (Postman)
       |
       v
Controller Layer
       |
       v
Service Layer
       |
       v
Repository Layer
       |
       v
Oracle Database
Package Structure
controller – Handles HTTP requests and returns API responses.
service – Contains the business logic.
repository – Communicates with the database through Spring Data JPA.
entity – Defines the mall entity and its database mapping.
📋 Mall Information
The application manages the following fields:

Field	Description
id	Unique identifier of the mall
name	Name of the mall
location	Location of the mall
contactNo	Mall contact number
totalfloors	Total number of floors
totalShops	Total number of shops
openingTime	Mall opening time
closingTime	Mall closing time
🔗 API Operations
The API supports the following operations, depending on the endpoint mappings implemented in the application:

Operation	HTTP Method	Purpose
Add Mall	POST	Create a mall record
Get All Malls	GET	Retrieve all mall records
Get Mall by ID	GET	Retrieve a specific mall
Update Mall	PUT	Update mall information
Delete Mall	DELETE	Delete a mall record
Note: Update the endpoint paths below to match the mappings in your controller.

Example endpoint patterns:

POST   /add
GET    /getAll
GET    /getById/{id}
PUT    /update/{id}
DELETE /remove/{id}
⚙️ Prerequisites
Before running the project, install:

Java JDK
Maven
Oracle Database
An IDE such as Eclipse, IntelliJ IDEA, or VS Code
Postman for API testing
▶️ How to Run the Project
Clone the repository:

git clone https://github.com/yatish4174/Mall-Management-System-REST-API.git
Open the project in your preferred Java IDE.

Configure the Oracle database connection in application.properties.

Verify that Oracle Database is running and that the database service name and credentials are correct.

Run the Spring Boot main application class.

Test the API endpoints using Postman at:

http://localhost:8080
🗄️ Database Configuration
Configure the following properties in application.properties using your own database credentials:

spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/FREE
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
Set DB_USERNAME and DB_PASSWORD in your environment before running the application. Do not commit actual database passwords to GitHub.

🧪 API Testing
Use Postman to test the API operations.

For POST and PUT requests, select Body → raw → JSON and provide the appropriate mall data.

Example JSON:

{
  "name": "City Centre Mall",
  "location": "Nashik",
  "contactNo": "9876543210",
  "totalfloors": 5,
  "totalShops": 100,
  "openingTime": "10:00 AM",
  "closingTime": "10:00 PM"
}
Adjust the JSON field names to match your entity class.

🎯 Project Objective
The objective of this project is to demonstrate practical knowledge of Java, Spring Boot, REST API development, layered architecture, Spring Data JPA, Hibernate, Oracle Database integration, and API testing using Postman.

👨‍💻 Author
Yatish Khairnar

GitHub: yatish4174
