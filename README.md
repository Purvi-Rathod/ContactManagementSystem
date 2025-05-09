Contact Management System
A simple web-based application to manage contacts, built using Java Servlets, JSP, and MySQL.
Features

Add a new contact
View all contacts
Edit an existing contact
Delete a contact

Technologies Used

Backend: Java Servlets, JDBC
Frontend: JSP, HTML, CSS
Database: MySQL
Build Tool: Maven
Server: Apache Tomcat

Setup Instructions

Prerequisites:

Java 11 or higher
Maven
MySQL
Apache Tomcat


Database Setup:

Create a MySQL database named contactdb.
Run the following SQL to create the contacts table:CREATE TABLE contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL
);




Configuration:

Update the database credentials in src/db/DBConnector.java (URL, USER, PASSWORD).


Build and Deploy:

Run mvn clean package to build the project.
Deploy the generated WAR file to Tomcat.


Access the Application:

Open http://localhost:8080/ContactManagementSystem in your browser.



Project Structure

src/controller: Servlets for handling HTTP requests
src/dao: Data Access Objects for database operations
src/dto: Data Transfer Objects
src/model: Entity classes
src/db: Database connection utility
src/webapp: JSP files, CSS, and web configuration
pom.xml: Maven configuration

Future Improvements

Add input validation
Implement user authentication
Enhance UI with JavaScript frameworks

