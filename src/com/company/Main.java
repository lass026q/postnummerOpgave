package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        ArrayList<Postnummer> list = new ArrayList<Postnummer>();

        int postnummer;
        String by;

        try {
            File fileToRead = new File("data/data.csv");
            Scanner myReader = new Scanner(fileToRead);

            while (myReader.hasNext()) {
                String[] splitNextLine = myReader.nextLine().split(",");

                postnummer = Integer.parseInt(splitNextLine[0]);
                by = splitNextLine[1];

                list.add(new Postnummer(by, postnummer));
            }


        } catch (FileNotFoundException e) {
            System.out.println("ups!");
        }

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        int userInput = 0;
        int userInputZip = 0;

        while (isRunning)
        {
            System.out.println("""
                                        
                    0: Cancel
                    1: Start
                    """);

            userInput = input.nextInt();

            if (userInput == 1)
            {
                System.out.println("Indtast postnummer:");
                userInputZip = input.nextInt();


                switch (userInput)
                {
                    case 0:
                        isRunning = false;
                        break;
                    case 1:
                        for (Postnummer byOgPostnummer : list
                        ) {
                            if (byOgPostnummer.getPostnummer() == userInputZip) {
                                System.out.println(byOgPostnummer);
                            }
                        }
                        break;
                }
            }
        }
    }
}

