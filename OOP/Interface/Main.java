package OOP.Interface;

import OOP.Interface.car.Car;

public class Main {
    public static void main(String[] args) {


        //Car car = new Car();
        //car.brake();
        //car.acc();
        //car.start();
        //car.stop();
        //Media carMedia = new Car(); //we will get what is in the car not what is in the Media
        //carMedia.stop();


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
            
        
            
       
    }
}
