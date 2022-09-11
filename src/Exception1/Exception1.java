package Exception1;

public class Exception1 {
    public static void main(String[] args) {

        try {
            int a=10;
            int b=0;
            System.out.println(a/b);
            Object o=null;

        }catch (ArithmeticException | IndexOutOfBoundsException | NullPointerException ex){
            System.err.println("Riyazi xeta bas verdi");
        }
        catch (Exception ex){
            System.out.println("Basqa xeta bas verdi");
        }
    }
}
