package main; //Package is like folder. Package can contain many classes. 

public class Hedgehog { //This defines a new class "hedgehog", which is like a template from which you can create multiple "hedgehogs"
    private String siilinnimi; //These variable store the hedgehog's name and age. Private means that these variables can only be accessed from within this class 
    private int siilinika; //These variable store the hedgehog's name and age. Private means that these variables can only be accessed from within this class 

    public Hedgehog(String siilinnimi, int siilinika) { //This is the constructor. When a new Hedgehog object is created, 
        //this code is executed. The constructor sets the hedgehog's name and age using the values ​​given as parameters.
        this.siilinnimi = siilinnimi; // Stores information about the hedgehog
        this.siilinika = siilinika; // Stores information about the hedgehog
    }

    public void puhemetodi(String puhesyote) { //This method prints a message that looks like the hedgehog is talking. It takes as a parameter a string (speech extract), which is a message spoken by the hedgehog.
        System.out.println(siilinnimi + ": " + puhesyote); //Prints hedgehogs name and input from main app ?
    }

    public void juoksumetodi(int kierrokset) { //This method prints a message saying that the hedgehog is running. It repeats the message as many times as the number of rounds (kierrokset) given as a parameter.
        for (int i = 0; i < kierrokset; i++) {
            System.out.println(siilinnimi + " juoksee kovaa vauhtia!");
        }
    }

    public String getSiilinnimi() { //This method returns the name of the hedgehog. 
        return siilinnimi;
    }

    public int getika() { //This method returns the age of the hedgehog. 
        return siilinika;
    }
}

