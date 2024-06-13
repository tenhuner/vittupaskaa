package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);
        Hedgehog siilinnimijaika = new Hedgehog("Pikseli", 2);

        while (true) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            int valinta;

            try {
                valinta = skanneri.nextInt();
                skanneri.nextLine(); // Clear the buffer
            } catch (InputMismatchException e) {
                System.out.println("Syöte oli väärä");
                skanneri.next(); // Clear the invalid input
                continue;
            }

            switch (valinta) {
                case 1:
                    System.out.println("Mitä siili sanoo:");
                    if (skanneri.hasNextLine()) {
                        String puhesyote = skanneri.nextLine();
                        siilinnimijaika.puhemetodi(puhesyote);
                    }
                    break;

                case 2:
                    System.out.println("Anna siilin nimi:");
                    String siilinnimi = skanneri.nextLine();
                    int siilinika;

                    try {
                        System.out.println("Anna siilin ikä:");
                        siilinika = skanneri.nextInt();
                        skanneri.nextLine(); // Clear the buffer
                    } catch (InputMismatchException e) {
                        System.out.println("Syöte oli väärä");
                        skanneri.next(); // Clear the invalid input
                        continue;
                    }

                    siilinnimijaika = new Hedgehog(siilinnimi, siilinika);
                    break;

                case 3:
                    int kierrokset;

                    try {
                        System.out.println("Kuinka monta kierrosta?");
                        kierrokset = skanneri.nextInt();
                        skanneri.nextLine(); // Clear the buffer
                    } catch (InputMismatchException e) {
                        System.out.println("Syöte oli väärä");
                        skanneri.next(); // Clear the invalid input
                        continue;
                    }

                    siilinnimijaika.juoksumetodi(kierrokset);
                    break;

                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    skanneri.close();
                    return;

                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }
    }
}
