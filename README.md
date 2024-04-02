# 🎫 Ticket Reservation System

## 🚀 Overview
The Ticket Reservation System is a Java application that allows users to make train reservations, fetch train information, and cancel reservations. It interacts with a MySQL database to store and retrieve reservation details.

## ✨ Features
- **Make a Reservation**: Users can make reservations by providing passenger details such as name, train number, class type, date of journey, departure station, and destination station.
- **Fetch Train Information**: Users can fetch train information by providing the train number.
- **Cancel Reservation**: Users can cancel a reservation by providing the PNR number.

## ⚙️ Prerequisites
Before running the application, ensure you have the following installed:
- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J library

## 🛠️ Setup
1. Clone the repository to your local machine.
2. Install MySQL Server and create a database named `reservation_system`.
3. Import the `reservation_system.sql` file to create the necessary tables and sample data.
4. Place the MySQL Connector/J JAR file (`mysql-connector-java-8.0.26.jar`) in the `lib` directory.
5. Compile the Java files using the following command:
    ```
    javac -cp ".;lib/mysql-connector-java-8.0.26.jar" com/mycompany/reservation_system/*.java
    ```
6. Run the application using the following command:
    ```
    java -cp ".;lib/mysql-connector-java-8.0.26.jar" com.mycompany.reservation_system.Main
    ```

## 📋 Usage
Follow the on-screen prompts to navigate through the application:
- Enter the option number to perform the desired action.
- Provide the required details as prompted.
- View the output messages for confirmation or error messages.
## 🚀 About Me
I'm a full stack Web & App Developer and an undergrad Data Science Student 👨‍💻🙌



## Authors

- [@Fahad](https://github.com/SyedFahad7)

