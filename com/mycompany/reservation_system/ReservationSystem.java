package com.mycompany.reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservationSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/reservation_system";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "QwerTYfahad&1";
    
    static {
        try {
            // Load the MySQL JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load MySQL JDBC driver.");
        }
    }

    // Method to insert reservation details into the database
    public void insertReservation(String passengerName, String trainNumber, String classType, String dateOfJourney, String departureStation, String destinationStation) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Insert reservation details into the database
            String sql = "INSERT INTO reservations (passenger_name, train_number, class_type, date_of_journey, departure_station, destination_station) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, passengerName);
                preparedStatement.setString(2, trainNumber);
                preparedStatement.setString(3, classType);
                preparedStatement.setString(4, dateOfJourney);
                preparedStatement.setString(5, departureStation);
                preparedStatement.setString(6, destinationStation);
    
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Reservation successfully inserted.");
                } else {
                    System.out.println("Failed to insert reservation.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Method to fetch train information based on train number
    public void fetchTrainInfo(String trainNumber) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM trains WHERE train_number = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, trainNumber);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    System.out.println("Train Information:");
                    System.out.println("Train Number: " + resultSet.getString("train_number"));
                    System.out.println("Train Name: " + resultSet.getString("train_name"));
                    System.out.println("Departure Time: " + resultSet.getString("departure_time"));
                    System.out.println("Arrival Time: " + resultSet.getString("arrival_time"));
                    // Add more fields as needed
                } else {
                    System.out.println("Train with number " + trainNumber + " not found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to cancel reservation based on PNR number
    public void cancelReservation(String pnrNumber) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "DELETE FROM reservations WHERE pnr_number = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, pnrNumber);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Reservation with PNR number " + pnrNumber + " successfully canceled.");
                } else {
                    System.out.println("Reservation with PNR number " + pnrNumber + " not found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}