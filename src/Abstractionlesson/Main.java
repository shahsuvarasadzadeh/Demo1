package Abstractionlesson;

import Bean.BMW;
import Bean.Car;
import Bean.Startable;
import Bean.Wolwo;

public class Main {
    public static void main(String[] args) {


        Car w = new Wolwo();
        System.out.println(w.getClass().getName());
        class Main$1 extends Car{
            @Override
            public void start() {
                System.out.println("alma");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }

            @Override
            public void speedUp() {
                System.out.println("speedUp");
            }
        }
        Car c=new Main$1();

        c = new Car() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void speedUp() {

            }
        };
        c = new Car() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void speedUp() {

            }
        };

    }
    public  static void startAllCars(Startable[] args){

    }
}