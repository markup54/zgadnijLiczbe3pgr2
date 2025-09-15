public class Main {
    public static void main(String[] args) {
        System.out.println("Dzień dobry");
        //typy proste
        //zmienne a nie obiekty
        //male litery
        //typy calkowite
        byte liczba1 =124;
        short liczba2 = 12345;
        int liczba3 = 1213243536;
        long liczba4 = 1213243536;
        System.out.println("Liczba całkowita "+liczba4);
        //typy zmiennoprzecinkowe
        float liczba5 =23.65f; //na końcu litera f
        double liczba6 = 235.54654;
        //typ logiczny
        boolean czyPrawda = true; // false
        //typ znakowy
        char znak = 'a';

        //wylosuj liczbę z zakresu od 1 do 100
        //zgadnij wylosowaną liczbę wpisując ja z klawiatury



        int wylosowanaLiczba = (int)(Math.random()*100+1);//rzutowanie
        double wylosowana2 = wylosowanaLiczba;
    }
}