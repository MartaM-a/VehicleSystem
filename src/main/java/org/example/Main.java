package org.example;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = null;


        System.out.println("Specify the type of car: PersonalCar or Bus");
            //for (int i = 1; i <= 2; i++) {
                String vehicleType = scanner.nextLine();


                if (vehicleType.equals("Bus")) {
                    vehicle = new Bus();
                    vehicle.driving();
                } else if (vehicleType.equals("PersonalCar")) {
                    vehicle = new PersonalCar();
                    vehicle.driving();
                } else {
                    System.out.println("Please write a valid type of vehicle");
                }



            if (vehicle != null) {
                System.out.print("Enter the speed in km/h :");

                double speed = scanner.nextDouble();

                vehicle.readSpeed(speed);




                System.out.println("Speed in km: " + vehicle.convertToKmph());
                System.out.println("Speed in miles: " + vehicle.convertToMph());


            }
        }

    }
