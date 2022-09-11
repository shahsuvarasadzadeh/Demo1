package Bean;

public class Wolwo extends Car{


    @Override
    public void start() {
        System.out.println("Wolwo Start");
    }

    @Override
    public void stop() {
        System.out.println("Wolwo Stop");
    }

    @Override
    public void speedUp() {
        System.out.println("Wolwo speedUp");
    }
}
