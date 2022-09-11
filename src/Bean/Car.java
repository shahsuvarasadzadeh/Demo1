package Bean;

public abstract class Car  {
    public abstract void start();//Abstract

    public abstract void stop();

    public abstract void speedUp();

    public void statAndSpeedUp(){// concrete
        start();
        speedUp();

    }
    public void speedDown(){
        System.out.println("speed down");
    }
}
