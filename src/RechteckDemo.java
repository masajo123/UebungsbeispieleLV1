import java.sql.SQLOutput;

public class RechteckDemo {

    /**
     * Zwei verschiedene Methoden
     * Siehe Lösung von Übungsbeispiel LV1
     * @param args
     */
    public static void main(String[] args) {
        int result = rechteck(4, 5);
        System.out.println("Fläche Rechteck: " + result + "m2");

        int breite = 2;
        int laenge = 3;

        int umfang = berechneUmfang(breite, laenge);
        System.out.println("Umfang: " + umfang);

    }

    public static int rechteck(int laenge, int breite){
        int resultFlaeche = laenge * breite;
        return resultFlaeche;
    }

    public static int berechneUmfang(int breite, int laenge) {
      return (breite + laenge) * 2;
    }
}
