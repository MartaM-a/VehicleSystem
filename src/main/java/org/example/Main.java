package org.example;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Specify the type of car: PersonalCar or Bus");

        String vehicleType = scanner.nextLine();

        if (vehicleType.equals("Bus")) {
            Bus bus = new Bus();
            bus.driving();
        }
         if (vehicleType.equals("PersonalCar")){
            PersonalCar personalCar = new PersonalCar();
            personalCar.driving();

        }
        else {
            System.out.println("Please write a valid type of vehicle");
        }




    }
}