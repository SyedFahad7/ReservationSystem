# <span style="color: #4CAF50;">🎫 Ticket Reservation System</span>

## <span style="color: #2196F3;">🚀 Overview</span>
The Ticket Reservation System is a Java application that allows users to make train reservations, fetch train information, and cancel reservations. It interacts with a MySQL database to store and retrieve reservation details.

## <span style="color: #FFC107;">✨ Features</span>
- <span style="color: #9C27B0;">**Make a Reservation**</span>: Users can make reservations by providing passenger details such as name, train number, class type, date of journey, departure station, and destination station.
- <span style="color: #9C27B0;">**Fetch Train Information**</span>: Users can fetch train information by providing the train number.
- <span style="color: #9C27B0;">**Cancel Reservation**</span>: Users can cancel a reservation by providing the PNR number.

## <span style="color: #E91E63;">⚙️ Prerequisites</span>
Before running the application, ensure you have the following installed:
- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J library

## <span style="color: #673AB7;">🛠️ Setup</span>
1. Clone the repository to your local machine.
2. Install MySQL Server and create a database named <span style="color: #2196F3;">`reservation_system`</span>.
3. Import the <span style="color: #2196F3;">`reservation_system.sql`</span> file to create the necessary tables and sample data.
4. Place the MySQL Connector/J JAR file (<span style="color: #2196F3;">`mysql-connector-java-8.0.26.jar`</span>) in the <span style="color: #2196F3;">`lib`</span> directory.
5. Compile the Java files using the following command:
    ```
    javac -cp ".;lib/mysql-connector-java-8.0.26.jar" com/mycompany/reservation_system/*.java
    ```
6. Run the application using the following command:
    ```
    java -cp ".;lib/mysql-connector-java-8.0.26.jar" com.mycompany.reservation_system.Main
    ```

## <span style="color: #009688;">📋 Usage</span>
Follow the on-screen prompts to navigate through the application:
- Enter the option number to perform the desired action.
- Provide the required details as prompted.
- View the output messages for confirmation or error messages.

## <span style="color: #2196F3;">🚀 About Me</span>
I'm a full stack Web & App Developer and an undergrad Data Science Student 👨‍💻🙌

## <span style="color: #FF5722;">Authors</span>

- <span style="color: #673AB7;">[@Fahad](https://github.com/SyedFahad7)</span>

