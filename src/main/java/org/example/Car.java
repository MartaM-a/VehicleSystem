package org.example;

public abstract class Car implements Vehicle  {


    protected double speed;


    @Override
    public void driving(){

        System.out.println( "Car is driving");
    }

    @Override
    public void readSpeed(double speed) {
        this.speed = speed;
    }



    @Override
    public  double convertToKmph(){
        return speed;

    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public double convertToMph (){
      return speed * 0.621371;


    }
}


