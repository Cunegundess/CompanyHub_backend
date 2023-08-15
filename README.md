<a name="readme-top"></a>

<h1 align="center">
  <br>
  <a href="http://github.com/Cunegundess/CompanyHub">
  <img src="./readme_Img/construcao.png" 
  alt="CompanyHub" 
  style="margin-bottom: 10px;">
  </a>
  <br>
  CompanyHub
  <br>
</h1>

<h4 align="center">A simple backend for the CompanyHub web app built on top of <a href="https://spring.io/" target="_blank">Spring Boot</a>.</h4>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Summary</summary>
  <ol>
    <li>
      <a href="#About-the-Project">About the Project</a>
        <ul>
          <li><a href="#Installation">Installation</a></li>
          <li><a href="#Usage">Usage</a></li>
    </li>
        <li><a href="#Technologies">Technologies</a></li>
        <li><a href="#Dependencies">Dependencies</a></li>
      </ul>
    </li>
    <li><a href="#Contact">Contact</a></li>
  </ol>
</details>

<a id="About-the-Project"></a>
# About the Project 📜

<h2>Welcome to CompanyHub 👋🏻</h2>

Welcome to **CompanyHub**, a dynamic and collaborative platform designed to streamline and enhance your company's workflow and communication. This project is dedicated to empowering businesses of all sizes by providing a comprehensive suite of tools and features that facilitate efficient project management, seamless team collaboration, and effective communication.

<img src="./readme_Img/Screenshot from 2023-08-05 00-23-56.png" alt="Preview 1">
<img src="./readme_Img/Screenshot from 2023-08-04 23-23-43.png" alt="Preview 2">
<img src="./readme_Img/Screenshot from 2023-08-04 23-23-00.png" alt="Preview 3">

Whether you're a startup striving for growth, a mid-sized company aiming for efficiency, or an enterprise seeking to optimize operations, **CompanyHub** is your reliable companion. Join us on this exciting journey to revolutionize how businesses collaborate, communicate, and succeed. Explore the potential of **CompanyHub** today and transform the way you work together.

</br>

<a id="Installation"></a>

## Installation


To run the CompanyHub Backend locally, follow these steps:


   
1.  Clone the repository:


    git clone https://github.com/Cunegundess/CompanyHub_backend.git


3.  Go to the project directory:


    cd CompanyHub_backend


4.  Build and run the project:


    ./mvnw spring-boot:run

The backend server will start running at http://localhost:8080.
</br>

<a id="Usage"></a>
## Usage

The backend provides APIs to support the CompanyHub web app. 
It manages data related to clients and documentation, 
allowing users to view client information and activity 
documentation. The data is presented in the web app's dashboard,
and users can navigate to the 'Clientes' and 'Docs' 
sections through the top navigation bar.



<a id="Technologies"></a>
# Technologies 🧑🏻‍💻

The CompanyHub Backend is built using the following technologies:

<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" /> <img src="https://img.shields.io/badge/Java-FFA500?style=for-the-badge&logo=java&logoColor=white" /> <img src="https://img.shields.io/badge/PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white" />

- Java and Spring Boot: The foundation of the backend logic.
- RESTful APIs: For communication with the CompanyHub web app.
- Database: Integrates with a PostgreSQL database to store and retrieve data.

<a id="Dependencies"></a>
## Dependencies

The backend relies on the following dependencies:

- `spring-boot-starter-data-jpa`: Provides JPA support for data access.
- `spring-boot-starter-web`: Enables Spring Web MVC for RESTful endpoints.
- `spring-boot-devtools`: Offers development tools for an improved development experience.
- `postgresql`: Provides runtime support for PostgreSQL database.
- `lombok`: Enhances code readability with annotations to avoid boilerplate code.
- `spring-boot-starter-test`: Includes testing dependencies for unit and integration testing.

</br>

<a id="Contact"></a>
# Contact 📨

Lucas Cunegundes - [LinkedIn](https://www.linkedin.com/in/lucas-cunegundes) - lucascsantana6@gmail.com
