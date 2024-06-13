package main; //Package is like folder. Package can contain many classes. 
import java.util.InputMismatchException; // "Import" brings necessary classes to the main program
import java.util.Scanner; // "Import" brings necessary classes to the main program

public class App { //This code defines a new class called App. A class is like a template from which objects can be created 
    public static void main( String[] args ) { //This is the main method. When the program is started, this code is executed first. main method is a special method that is used to start program execution.
    
       Scanner skanneri = new Scanner(System.in); //Creates scanner olio to read user written text, must be in public so Hedgehog.java can use this also
       Hedgehog siilinnimijaika = new Hedgehog("Pikseli", 2); //Creates orginal hedgehog

       while (true) { //Keeps printing menu when while is true
       System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma"); //Prints menu to user
       int valinta; //Initializes a variable for user selection
       
       try {
         valinta = skanneri.nextInt(); //Reads users choice
        skanneri.nextLine(); //this may be necessary;
       } catch (InputMismatchException e) {
        System.out.println("Syöte oli väärä");
        skanneri.next(); // Clear the invalid input
        continue; // Restart the loop
       }

    switch (valinta) { //starts switch sentence
        case 1: //If user chooses 1 this happens. User chose to make the hedgehog talk
            System.out.println("Mitä siili sanoo:");
            String puhesyote = skanneri.nextLine(); //saves what user writes 
            siilinnimijaika.puhemetodi(puhesyote); //calls puhemetodi with puhesyote input 
            break;

        case 2: //The user chose to make a new hedgehog
            System.out.println("Anna siilin nimi:"); //prints the question
            String siilinnimi = skanneri.nextLine(); //reads user input
            int siilinika; //Initializes a variable for user selection
                    // Reading the age and handling invalid inputs
                    try {
                        System.out.println("Anna siilin ikä:");
                        siilinika = skanneri.nextInt();
                        skanneri.nextLine(); // Consume the newline character
                    } catch (InputMismatchException e) { // If the input is not a number, print an error message and start the loop again
                        System.out.println("Syöte oli väärä");
                        skanneri.next(); // Clear the invalid input
                        continue; // Restart the loop
                    }


             siilinnimijaika = new Hedgehog(siilinnimi, siilinika); // new hedgehog is created based on user input
             break;

            case 3:
            int kierrokset; //Initializes a variable for user selection
            try {
                System.out.println("Kuinka monta kierrosta?");
                kierrokset = skanneri.nextInt();
                skanneri.nextLine();
            } catch (InputMismatchException e) { // If the input is not a number, print an error message and start the loop again
                System.out.println("Syöte oli väärä");
                skanneri.next(); // Clear the invalid input
                continue; // Restart the loop
            }
            siilinnimijaika.juoksumetodi(kierrokset);
            break;
            
            case 0: 
            System.out.println("Kiitos ohjelman käytöstä.");+
            skanneri.nextLine();
            skanneri.close();
            return;
            
            default: //Maybe some error guides herej
            System.out.println("Syöte oli väärä");
            break;

            }
        }
    }
}