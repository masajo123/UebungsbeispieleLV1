public class ZinsDemo {
    public static void main(String[] args) {

        double kontostand = 1000;
        double zinsen = 1.25;
        double result = ((kontostand * zinsen) / 100);
        System.out.println(result);

        System.out.println(berechneZinsen(500, 2));
        System.out.println(berechneZinsen(2335.888, 2.25));
        System.out.println(berechneZinsen(8555.99, 1.09));

    }
    public static double berechneZinsen(double kontostand, double zinsen) {
        double result = ((kontostand * zinsen) / 100);
        return result;
    }
}
