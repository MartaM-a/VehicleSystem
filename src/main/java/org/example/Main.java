package org.example;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Specify the type of car: PersonalCar or Bus");
        for (int i = 1; i <= 5; i++) {

            Vehicle vehicle;

            String vehicleType = scanner.nextLine();


            if (vehicleType.equals("Bus")) {
                vehicle = new Bus();

            } else if (vehicleType.equals("PersonalCar")) {
                vehicle = new PersonalCar();

            } else {
                System.out.println("Please write a valid type of vehicle");
                continue;
            }

            vehicle.driving();

            while (true) {

                System.out.print("Enter the speed in km/h :");

                try {

                    double speed = scanner.nextDouble();

                    scanner.nextLine();

                    vehicle.readSpeed(speed);
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            }
            System.out.println("Increase speed? Yes or No");
            String yesOrNo = scanner.nextLine();
            if (yesOrNo.equals("Yes")) {
                vehicle.speedUp();
            }

            System.out.println("Speed in km: " + vehicle.convertToKmph());
            System.out.println("Speed in miles: " + vehicle.convertToMph());


            System.out.println("Decrease speed? Yes or No");
             yesOrNo = scanner.nextLine();
            if(yesOrNo.equals("Yes")) {
                vehicle.slowDown();
            }

            System.out.println("Speed in km: " + vehicle.convertToKmph());
            System.out.println("Speed in miles: " + vehicle.convertToMph());
            }
        }

    }
