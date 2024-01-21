/*
Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran.
Dla przykładu, dla liczb 10, -2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100.
Zastanów się, jak można posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie.
Przetestuj je na różnych zestawach danych.
Możesz też skorzystać z jednego z popularnych algorytmów sortowania, np. sortowania przez wstawianie.
Opis tego algorytmu znajdziesz w internecie.
 */


import java.util.Scanner;

public class DodawanieLiczb {
    public static void main(String[] args) {
        System.out.println(zliczZnaki("Ala ma kota", 'a'));
        System.out.println(zliczZnaki("Ala ma kota", 'A'));
        System.out.println(zliczZnaki("Ala ma kota", 'x'));
    }

    public static int zliczZnaki(String tekst, char znak) {
    int liczbaZnakowWTekscie = 0;
    for (int i = 0; i < tekst.length(); i++){
       if (tekst.charAt(i) == znak) {
           liczbaZnakowWTekscie++;
       }
    }
    return liczbaZnakowWTekscie;
    }
}
