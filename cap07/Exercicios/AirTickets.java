package Exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AirTickets {
    private static boolean[] seats = new boolean[10];

    public static void main(String[] args) {
        Arrays.fill(seats, false);
        printBoarding();
        typeClass(seats);
    }

    public static void typeClass(boolean[] array) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.print("Enter type: ");
            int choice = input.nextInt();

            if (choice == 1) {
                if (assignSeat(1, 5)) {
                    printBoardingPass("First Class", findAvailableSeat(1, 5));
                } else if (assignSeat(6, 10)) {
                    printBoardingPass("Economy", findAvailableSeat(6, 10));
                } else {
                    System.out.println("Sorry, the flight is fully booked. Next flight leaves in 3 hours");
                }
            } else if (choice == 2) {
                if (assignSeat(6, 10)) {
                    printBoardingPass("Economy", findAvailableSeat(6, 10));
                } else if (assignSeat(1, 5)) {
                    printBoardingPass("First Class", findAvailableSeat(1, 5));
                } else {
                    System.out.println("Sorry, the flight is fully booked. Next flight leaves in 3 hours");
                }
            } else {
                System.out.println("Invalid choice. PLease type 1 for First Class or 2 for Economy");
            }

            System.out.println("Do you want to make another reservation? (yes/no)");
            String anotherReservation = input.next();

            if (!anotherReservation.equalsIgnoreCase("yes")) {
                break;
            }

        }
        input.close();
    }

    public static boolean assignSeat(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return true;
            }
        }
        return false;
    }

    public static int findAvailableSeat(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void printBoardingPass(String seatClass, int seatNumber) {
        System.out.println("\nBoarding Pass:");
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Seat Number: " + seatNumber);
    }

    private static void printBoarding() {
        int choice = 1;
        System.out.println("Status");
        for (boolean status : seats) {
            if (choice <= 6) {
                System.out.printf("%nFirst Class %n[%d] %b", choice, status);
            } else {
                System.out.printf("%nEconomy %n[%d] %b", choice, status);
            }

            choice++;
        }
        System.out.println();
    }

}
