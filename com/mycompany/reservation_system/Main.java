package com.mycompany.reservation_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Reservation System");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Make a reservation");
            System.out.println("2. Fetch train information");
            System.out.println("3. Cancel reservation");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    reservationSystem.insertReservation();
                    break;
                case 2:
                    System.out.println("Enter train number:");
                    String trainNumber = scanner.nextLine();
                    reservationSystem.fetchTrainInfo(trainNumber);
                    break;
                case 3:
                    System.out.println("Enter PNR number:");
                    String pnrNumber = scanner.nextLine();
                    reservationSystem.cancelReservation(pnrNumber);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
