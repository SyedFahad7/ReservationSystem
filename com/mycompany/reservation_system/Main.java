package com.mycompany.reservation_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        System.out.println("Welcome to the Reservation System");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Make a reservation");
            System.out.println("2. Fetch train information");
            System.out.println("3. Cancel reservation");
            System.out.println("4. Exit");

            int choice = 0;
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter your choice: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Please enter a valid option: ");
                    scanner.next(); // Discard the invalid input and wait for a new input..
                }
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid option.");
                continue;
            }

            switch (choice) {
                case 1:
                    makeReservation(reservationSystem);
                    break;
                case 2:
                    fetchTrainInfo(reservationSystem);
                    break;
                case 3:
                    cancelReservation(reservationSystem);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void makeReservation(ReservationSystem reservationSystem) {
        String passengerName;
        String trainNumber;
        String classType;
        String dateOfJourney;
        String departureStation;
        String destinationStation;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter passenger name:");
            passengerName = scanner.nextLine();

            System.out.println("Enter train number:");
            trainNumber = scanner.nextLine();

            System.out.println("Enter class type:");
            classType = scanner.nextLine();

            System.out.println("Enter date of journey (YYYY-MM-DD):");
            dateOfJourney = scanner.nextLine();

            System.out.println("Enter departure station:");
            departureStation = scanner.nextLine();

            System.out.println("Enter destination station:");
            destinationStation = scanner.nextLine();

            reservationSystem.insertReservation(passengerName, trainNumber, classType, dateOfJourney, departureStation, destinationStation);
        }
    }

    private static void fetchTrainInfo(ReservationSystem reservationSystem) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter train number:");
            String trainNumber = scanner.nextLine();

            reservationSystem.fetchTrainInfo(trainNumber);
        }
    }

    private static void cancelReservation(ReservationSystem reservationSystem) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter PNR number:");
            String pnrNumber = scanner.nextLine();

            reservationSystem.cancelReservation(pnrNumber);
        }
    }
}