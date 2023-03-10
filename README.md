# Spring REST API for Employee Management and Arabic Word Search
This is a Spring REST API project developed using Java and PostgreSQL for managing employees and searching Arabic words.

# Features
* Employee Management: This API allows users to create list of employees or single employee, Each employee has a unique ID, fisrt name , last name , full name, age, and name nomralize.
* Arabic Search: This API allows users to search for Arabic words in a database of pre-defined words. Users can enter a search term and the API will return a list of words that contain the search term.

# Technology Stack
The following technologies are used in this project:

* Java
* Spring Framework
* PostgreSQL
* Maven

# Getting Started
To get started with this project, follow these steps:

* Clone this repository to your local machine.
* Install PostgreSQL and create a database called employee_db.

* Create a table in the employee_db database with the following schema:
 CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(500) NOT NULL,
    last_name VARCHAR(500) NOT NULL,
    full_name VARCHAR(1000) NOT NULL,
    name_normalize VARCHAR(1000) NOT NULL,
    age int not null;
    
);

* Update the database configuration in src/main/resources/application.properties to match your PostgreSQL database configuration.
* Build and run the project using Maven:
mvn spring-boot:run

# API Endpoints
  The following API endpoints are available:

# Employee Management
* POST /employees/save: Create a new employee.
* POST /employees/save/all: Create list of employees.

# Arabic Search
* GET /employees/search?q={searchTerm}: Search for Arabic words that contain the specified search term.

# License
This project is licensed under the MIT License. See the LICENSE file for details.




